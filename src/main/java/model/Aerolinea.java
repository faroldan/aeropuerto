package model;

import exceptions.AerolineaException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aerolinea extends AerolineaException {

    private String cuit;
    private String CodIATA;
    private String nombre;
    private Date fechaInicioAct;

    public Aerolinea(String cuit, String codIATA, String nombre, Date fechaInicioAct) throws AerolineaException {
        Pattern p = Pattern.compile("[[0-9]{2}-[0-9]{8}-[0-9]{1}]");
        Matcher m;
        if (cuit != null && CodIATA != null && nombre != null && fechaInicioAct != null) {
            m = p.matcher(cuit);
            if (m.find()) {
                this.cuit = cuit;
            } else {
                throw new AerolineaException("El CUIT no posee el formato correcto");
            }
            this.cuit = cuit;
            this.CodIATA = codIATA;
            this.nombre = nombre;
            this.fechaInicioAct = fechaInicioAct;
        }
        else {throw new AerolineaException();}
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setCodIATA(String codIATA) {
        CodIATA = codIATA;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaInicioAct(Date fechaInicioAct) {
        this.fechaInicioAct = fechaInicioAct;
    }

    public String getCuit() {
        return cuit;
    }

    public String getCodIATA() {
        return CodIATA;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaInicioAct() {
        return fechaInicioAct;
    }
}