//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.24 at 04:41:59 AM CEST 
//


package com.ftn_booking.agentendpoint;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonthlyPrices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonthlyPrices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mainServerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="monthlyPrices" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyPrices", propOrder = {
    "mainServerId",
    "year",
    "monthlyPrices"
})
public class MonthlyPrices {

    protected long mainServerId;
    protected int year;
    @XmlElement(type = Double.class)
    protected List<Double> monthlyPrices;

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
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the monthlyPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthlyPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthlyPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getMonthlyPrices() {
        if (monthlyPrices == null) {
            monthlyPrices = new ArrayList<Double>();
        }
        return this.monthlyPrices;
    }

}