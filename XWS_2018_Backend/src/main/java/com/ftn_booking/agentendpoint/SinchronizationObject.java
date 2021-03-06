//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.15 at 09:07:47 PM CEST 
//


package com.ftn_booking.agentendpoint;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SinchronizationObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SinchronizationObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accTypesList" type="{http://ftn-booking.com/agentEndpoint}AccomodationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accCatsList" type="{http://ftn-booking.com/agentEndpoint}AccomodationCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bonusFeaturesList" type="{http://ftn-booking.com/agentEndpoint}BonusFeature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="countriesList" type="{http://ftn-booking.com/agentEndpoint}Country" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="citiesList" type="{http://ftn-booking.com/agentEndpoint}City" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="regUserMessagesList" type="{http://ftn-booking.com/agentEndpoint}RegUsrMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reservationsList" type="{http://ftn-booking.com/agentEndpoint}MainServerReservation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SinchronizationObject", propOrder = {
    "accTypesList",
    "accCatsList",
    "bonusFeaturesList",
    "countriesList",
    "citiesList",
    "regUserMessagesList",
    "reservationsList"
})
public class SinchronizationObject {

    protected List<AccomodationType> accTypesList;
    protected List<AccomodationCategory> accCatsList;
    protected List<BonusFeature> bonusFeaturesList;
    protected List<Country> countriesList;
    protected List<City> citiesList;
    protected List<RegUsrMessage> regUserMessagesList;
    protected List<MainServerReservation> reservationsList;

    /**
     * Gets the value of the accTypesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accTypesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccTypesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccomodationType }
     * 
     * 
     */
    public List<AccomodationType> getAccTypesList() {
        if (accTypesList == null) {
            accTypesList = new ArrayList<AccomodationType>();
        }
        return this.accTypesList;
    }

    /**
     * Gets the value of the accCatsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accCatsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccCatsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccomodationCategory }
     * 
     * 
     */
    public List<AccomodationCategory> getAccCatsList() {
        if (accCatsList == null) {
            accCatsList = new ArrayList<AccomodationCategory>();
        }
        return this.accCatsList;
    }

    /**
     * Gets the value of the bonusFeaturesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bonusFeaturesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBonusFeaturesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BonusFeature }
     * 
     * 
     */
    public List<BonusFeature> getBonusFeaturesList() {
        if (bonusFeaturesList == null) {
            bonusFeaturesList = new ArrayList<BonusFeature>();
        }
        return this.bonusFeaturesList;
    }

    /**
     * Gets the value of the countriesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countriesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountriesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Country }
     * 
     * 
     */
    public List<Country> getCountriesList() {
        if (countriesList == null) {
            countriesList = new ArrayList<Country>();
        }
        return this.countriesList;
    }

    /**
     * Gets the value of the citiesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citiesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitiesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link City }
     * 
     * 
     */
    public List<City> getCitiesList() {
        if (citiesList == null) {
            citiesList = new ArrayList<City>();
        }
        return this.citiesList;
    }

    /**
     * Gets the value of the regUserMessagesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regUserMessagesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegUserMessagesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegUsrMessage }
     * 
     * 
     */
    public List<RegUsrMessage> getRegUserMessagesList() {
        if (regUserMessagesList == null) {
            regUserMessagesList = new ArrayList<RegUsrMessage>();
        }
        return this.regUserMessagesList;
    }

    /**
     * Gets the value of the reservationsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservationsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservationsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MainServerReservation }
     * 
     * 
     */
    public List<MainServerReservation> getReservationsList() {
        if (reservationsList == null) {
            reservationsList = new ArrayList<MainServerReservation>();
        }
        return this.reservationsList;
    }

}
