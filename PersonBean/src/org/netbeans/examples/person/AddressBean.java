/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.netbeans.examples.person;

import java.beans.*;
import java.io.Serializable;

/**
 * A simple bean representing an address in the United States.
 * @author Wade Chandler
 * @version 1.0
 */
public class AddressBean implements Serializable {


    private String address1 = null;
    private String address2 = null;
    private String city = null;
    private String state = null;
    private String zip = null;

    private PropertyChangeSupport propertySupport;

    public AddressBean() {
        propertySupport = new PropertyChangeSupport(this);
    }


    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        String old = this.address1;
        this.address1 = address1;
        this.propertySupport.firePropertyChange("address1", old, address1);
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        String old = this.address2;
        this.address2 = address2;
        propertySupport.firePropertyChange("address2", old, address2);
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        String old = this.city;
        this.city = city;
        propertySupport.firePropertyChange("city", old, city);
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        String old = this.state;
        this.state = state;
        propertySupport.firePropertyChange("state", old, state);
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        String old = this.zip;
        this.zip = zip;
        propertySupport.firePropertyChange("zip", old, zip);
    }

    public static AddressBean createAddressBean(String address1, String address2, String city, String state, String zip){
        AddressBean ret = new AddressBean();
        ret.address1 = address1;
        ret.address2 = address2;
        ret.city = city;
        ret.state = state;
        ret.zip = zip;
        return ret;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Address[");
        sb.append(address1);
        sb.append(',');
        sb.append(address2);
        sb.append(',');
        sb.append(city);
        sb.append(',');
        sb.append(state);
        sb.append(',');
        sb.append(zip);
        sb.append(']');
        return sb.toString();
    }

}
