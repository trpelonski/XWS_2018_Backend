//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.23 at 04:05:17 PM CEST 
//


package com.ftn_booking.agentendpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservationLite" type="{http://ftn-booking.com/agentEndpoint}ReservationLite"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reservationLite"
})
@XmlRootElement(name = "confirmReservationRequest")
public class ConfirmReservationRequest {

    @XmlElement(required = true)
    protected ReservationLite reservationLite;

    /**
     * Gets the value of the reservationLite property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationLite }
     *     
     */
    public ReservationLite getReservationLite() {
        return reservationLite;
    }

    /**
     * Sets the value of the reservationLite property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationLite }
     *     
     */
    public void setReservationLite(ReservationLite value) {
        this.reservationLite = value;
    }

}
