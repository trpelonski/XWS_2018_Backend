//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.24 at 04:02:06 AM CEST 
//


package com.ftn_booking.agentendpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationLite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationLite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservationMainServerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="reservationStatus" type="{http://ftn-booking.com/agentEndpoint}ReservationStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationLite", propOrder = {
    "reservationMainServerId",
    "reservationStatus"
})
public class ReservationLite {

    protected long reservationMainServerId;
    @XmlElement(required = true)
    protected ReservationStatus reservationStatus;

    /**
     * Gets the value of the reservationMainServerId property.
     * 
     */
    public long getReservationMainServerId() {
        return reservationMainServerId;
    }

    /**
     * Sets the value of the reservationMainServerId property.
     * 
     */
    public void setReservationMainServerId(long value) {
        this.reservationMainServerId = value;
    }

    /**
     * Gets the value of the reservationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationStatus }
     *     
     */
    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    /**
     * Sets the value of the reservationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationStatus }
     *     
     */
    public void setReservationStatus(ReservationStatus value) {
        this.reservationStatus = value;
    }

}
