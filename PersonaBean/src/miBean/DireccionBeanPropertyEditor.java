/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miBean;

import java.awt.Component;
import java.beans.*;

/**
 *
 * @author Alejandro
 */
public class DireccionBeanPropertyEditor extends PropertyEditorSupport {
    
    private DireccionBeanEditorPanel editor = null;
    
    public DireccionBeanPropertyEditor() {
        editor = new DireccionBeanEditorPanel();
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
        
        DireccionBean ret = (DireccionBean) super.getValue();
        ret.setDireccion(editor.jTextFieldDireccion.getText());
        ret.setCP(editor.jTextFielCP.getText());
        return ret;
    }

    @Override
    public void setValue(Object direccion) {
        if(direccion==null){
            direccion = new DireccionBean();
        }
        super.setValue(direccion);

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
        DireccionBean bean = (DireccionBean) getValue();
        StringBuffer ret = new StringBuffer();
        ret.append(DireccionBean.class.getName());
        ret.append(".createAddressBean(\"");
        ret.append(bean.getDireccion());
        ret.append("\",\"");
        ret.append(bean.getCP());
        ret.append("\")");
        return ret.toString();
    }
}
