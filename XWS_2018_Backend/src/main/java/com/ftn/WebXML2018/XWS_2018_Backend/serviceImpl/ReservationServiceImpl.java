package com.ftn.WebXML2018.XWS_2018_Backend.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ftn.WebXML2018.XWS_2018_Backend.entity.BookingUnit;
import com.ftn.WebXML2018.XWS_2018_Backend.entity.RegisteredUser;
import com.ftn.WebXML2018.XWS_2018_Backend.entity.Reservation;
import com.ftn.WebXML2018.XWS_2018_Backend.exceptions.ReservationAlredyExsistsException;
import com.ftn.WebXML2018.XWS_2018_Backend.repository.ReservationRepository;
import com.ftn.WebXML2018.XWS_2018_Backend.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{

	@Autowired
	private ReservationRepository reservationRepository;
	
	@Override
	public Page<Reservation> findReservationsByUser(RegisteredUser user, Pageable pageable) {
		
		return reservationRepository.findByRegisteredUser(user, pageable);
	}

	@Override
	public Page<Reservation> findByRegisteredUserAndConfirmed(RegisteredUser registeredUser, boolean confirmed,
			Pageable pageable) {
		
		return reservationRepository.findByRegisteredUserAndConfirmedOrderByFromDateDesc(registeredUser, confirmed, pageable);
	}

	@Override
	@Transactional(readOnly = false, rollbackFor = Exception.class, propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE)
	public Reservation saveReservation(Reservation reservation) throws ReservationAlredyExsistsException {
		
		List<Reservation> reservations = reservationRepository.findCriticalReservations(reservation.getBookingUnit(), reservation.getFromDate(), reservation.getToDate());
		
		if(!reservations.isEmpty()) {
			throw new ReservationAlredyExsistsException("Vec postoji rezervecija koja se preklapa sa zadatim terminom.");
		}
		
		Reservation retVal = reservationRepository.save(reservation);
		
		return retVal;
	}

	@Override
	public List<Reservation> findCriticalReservations(BookingUnit bookingUnit, Date startDate, Date endDate) {
		
		return reservationRepository.findCriticalReservations(bookingUnit, startDate, endDate);
	}

	@Override
	public Reservation findById(Long id) {
		
		return reservationRepository.findOne(id);
	}

}
