package com.ftn.WebXML2018.XWS_2018_Backend.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ftn.WebXML2018.XWS_2018_Backend.entity.City;
import com.ftn.WebXML2018.XWS_2018_Backend.entity.Country;
import com.ftn.WebXML2018.XWS_2018_Backend.repository.CityRepository;
import com.ftn.WebXML2018.XWS_2018_Backend.service.CityService;

@Service
public class CityServiceImpl implements CityService{

	@Autowired
	private CityRepository cityRepository;
	
	@Override
	public City getOne(Long id) {
		
		return cityRepository.findOne(id);
	}

	@Override
	public List<City> getAll() {
		
		return cityRepository.findAll();
	}

	@Override
	public void deleteCity(City city) {
		
		cityRepository.delete(city);
	}

	@Override
	public List<City> getCitiesByCountry(Country country) {
		
		return cityRepository.findByCountry(country);
	}

	@Override
	public City saveCity(City city) {
		
		return cityRepository.save(city);
	}

	@Override
	public Page<City> findByNameLike(String name, Pageable pageable) {
		return cityRepository.findByNameLikeIgnoreCase("%"+name+"%", pageable);
	}

}
