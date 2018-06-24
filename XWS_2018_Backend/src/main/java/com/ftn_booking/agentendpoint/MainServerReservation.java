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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MainServerReservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MainServerReservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mainServerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="totalPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="reservationStatus" type="{http://ftn-booking.com/agentEndpoint}ReservationStatus"/>
 *         &lt;element name="subjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subjectSurname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bookingUnitMainServerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MainServerReservation", propOrder = {
    "mainServerId",
    "from",
    "to",
    "totalPrice",
    "reservationStatus",
    "subjectName",
    "subjectSurname",
    "bookingUnitMainServerId"
})
public class MainServerReservation {

    protected long mainServerId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar from;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar to;
    protected double totalPrice;
    @XmlElement(required = true)
    protected ReservationStatus reservationStatus;
    @XmlElement(required = true)
    protected String subjectName;
    @XmlElement(required = true)
    protected String subjectSurname;
    protected long bookingUnitMainServerId;

    /**
     * Gets the value of the mainServerId property.
     * 
     */
    public long getMainServerId() {
        return mainServerId;
    }

    /**
     * Sets the value of the mainServerId property.
     * 
     */
    public void setMainServerId(long value) {
        this.mainServerId = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrom(XMLGregorianCalendar value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTo(XMLGregorianCalendar value) {
        this.to = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     */
    public void setTotalPrice(double value) {
        this.totalPrice = value;
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

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the subjectSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectSurname() {
        return subjectSurname;
    }

    /**
     * Sets the value of the subjectSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectSurname(String value) {
        this.subjectSurname = value;
    }

    /**
     * Gets the value of the bookingUnitMainServerId property.
     * 
     */
    public long getBookingUnitMainServerId() {
        return bookingUnitMainServerId;
    }

    /**
     * Sets the value of the bookingUnitMainServerId property.
     * 
     */
    public void setBookingUnitMainServerId(long value) {
        this.bookingUnitMainServerId = value;
    }

}
