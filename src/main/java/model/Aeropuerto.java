package model;

import exceptions.AeropuertoException;
import exceptions.AvionException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aeropuerto {
    private String CodIATA;
    private String nombre;
    private String ciudad;
    private String CP;
    Pattern p=Pattern.compile("[[A-Z]{3}]");
    Matcher m;
    public Aeropuerto(String codIATA, String nombre, String ciudad, String CP) throws AeropuertoException{

        if (!CodIATA.equals(null) && !nombre.equals(null) && !ciudad.equals(null) && !CP.equals(null)){
            m=p.matcher(CodIATA);
            if (m.find()) {
                CodIATA = CodIATA;
            }else{
                throw new AeropuertoException("El codigo IATA no posee el formato correcto");
            }
            this.nombre = nombre;
            this.ciudad = ciudad;
            this.CP = CP;
        }
        else {throw new AeropuertoException();}
    }

    public String getCodIATA() {
        return CodIATA;
    }

    public void setCodIATA(String codIATA)throws AeropuertoException {
        m=p.matcher(CodIATA);
        if (m.find()) {
            CodIATA = CodIATA;
        }else{
            throw new AeropuertoException("El codigo IATA no posee el formato correcto");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }
}
