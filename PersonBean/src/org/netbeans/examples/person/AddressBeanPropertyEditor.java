/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.netbeans.examples.person;

import java.awt.Component;
import java.beans.*;

/**
 * AddressBean property editor. This can be used as a property editor for properties using this bean.
 * @author Wade Chandler
 * @version 1.0
 */
public class AddressBeanPropertyEditor extends PropertyEditorSupport {

    private AddressBeanEditorPanel editor = null;

    public AddressBeanPropertyEditor() {
        this.editor = new AddressBeanEditorPanel();
    }

    @Override
    public Component getCustomEditor() {
        return editor;
    }

    @Override
    public String[] getTags() {
        return null;
    }

    @Override
    public Object getValue() {
        if(super.getValue()==null){
            setValue(null);
        }
        AddressBean ret = (AddressBean) super.getValue();
        ret.setAddress1(editor.address1.getText());
        ret.setAddress2(editor.address2.getText());
        ret.setCity(editor.city.getText());
        ret.setState(editor.state.getText());
        ret.setZip(editor.zip.getText());
        return ret;
    }

    @Override
    public void setValue(Object address) {
        if(address==null){
            address = new AddressBean();
        }
        super.setValue(address);

    }

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public String getAsText(){
        return super.getAsText();
    }

    @Override
    public void setAsText(String text){
        throw new IllegalArgumentException("Address can not be set this way. Please use the editor.");
    }

    @Override
    public String getJavaInitializationString() {
        AddressBean bean = (AddressBean) getValue();
        StringBuffer ret = new StringBuffer();
        ret.append(AddressBean.class.getName());
        ret.append(".createAddressBean(\"");
        ret.append(bean.getAddress1());
        ret.append("\",\"");
        ret.append(bean.getAddress2());
        ret.append("\",\"");
        ret.append(bean.getCity());
        ret.append("\",\"");
        ret.append(bean.getState());
        ret.append("\",\"");
        ret.append(bean.getZip());
        ret.append("\")");
        return ret.toString();
    }



}
