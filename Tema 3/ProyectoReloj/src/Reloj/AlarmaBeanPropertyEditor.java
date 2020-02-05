/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj;

import java.awt.Component;
import java.beans.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Beli
 */
public class AlarmaBeanPropertyEditor extends PropertyEditorSupport {
    
    
    
    private AlarmaEditorPanel editor = null;
    
    public AlarmaBeanPropertyEditor() {
        this.editor = new AlarmaEditorPanel();
    }
    
    @Override
    public boolean supportsCustomEditor(){
        return true;
    }
    
    @Override
    public Component getCustomEditor() {
        return editor;
    }
    
    @Override
    public Object getValue() {
        if (super.getValue()==null){ 
            setValue(null); 
        }
        AlarmaBean ret = (AlarmaBean) super.getValue();
        ret.setActivada(editor.jCheckBoxActivada.isSelected() ? "true":"false");
        Date date = (Date)editor.jSpinnerHora.getValue();
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        ret.setHoraAlarma(df.format(date));
        return ret;
    }

    @Override
    public void setValue(Object alarma) {
        if(alarma==null){
            alarma = new AlarmaBean();
        }
        super.setValue(alarma);

    }
    
    @Override
    public String getJavaInitializationString() {
        AlarmaBean bean = (AlarmaBean) getValue();
        StringBuffer ret = new StringBuffer();
        ret.append(AlarmaBean.class.getName());
        ret.append(".createAlarmaBean(\"");
        ret.append(bean.getActivada());
        ret.append("\",\"");
        ret.append(bean.getHoraAlarma());
        ret.append("\")");
        return ret.toString();
    }
    

    @Override
    public String[] getTags() {
        return null;
    }
    

    @Override
    public String getAsText(){
        return super.getAsText();
    }
}
