package model;

import exceptions.AvionException;
import exceptions.PilotoException;
import exceptions.VuelosException;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Piloto extends PilotoException{
    private String cuil;
    private String apellido;
    private String nombre;
    private Date fechaNac;

    public Piloto(String cuil, String apellido, String nombre, Date fechaNac) throws PilotoException {
        Pattern p= Pattern.compile("[[0-0]{2}-[0-9]{8}-[0-9]{1}]");
        Matcher m;
        if(!cuil.equals(null)&& !apellido.equals(null) && !nombre.equals(null) && !fechaNac.equals(null)){
             m= p.matcher(cuil);
            if(m.find()){this.cuil = cuil; } else { throw new PilotoException("El CUIL no posee el formato correcto");}
            this.apellido = apellido;
            this.nombre = nombre;
            this.fechaNac = fechaNac;
        } else{throw new PilotoException(); }


    }
}
