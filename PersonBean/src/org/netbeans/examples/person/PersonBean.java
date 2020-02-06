/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.netbeans.examples.person;

import java.beans.*;
import java.io.Serializable;

/**
 * A simple bean to represent a person.
 * @author Wade Chandler
 * @version 1.0
 */
public class PersonBean implements Serializable {

    private String firstName = null;
    private String lastName = null;
    private String phone = null;
    private AddressBean address = null;


    private PropertyChangeSupport propertySupport;

    public PersonBean() {
        propertySupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        String old = this.firstName;
        this.firstName = firstName;
        propertySupport.firePropertyChange("firstName", old, firstName);
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        String old = this.lastName;
        this.lastName = lastName;
        propertySupport.firePropertyChange("lastName", old, lastName);
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        String old = this.phone;
        this.phone = phone;
        propertySupport.firePropertyChange("phone", old, phone);
    }

    /**
     * @return the address
     */
    public AddressBean getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(AddressBean address) {
        AddressBean old = this.address;
        this.address = address;
        propertySupport.firePropertyChange("address", old, address);
    }


}
