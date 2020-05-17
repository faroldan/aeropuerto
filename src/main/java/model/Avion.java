package model;

import exceptions.AvionException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Avion {
    private String matricula;
    private String modelo;
    private int capacidad;
    private int anio_fab;

    public Avion(String matricula, String modelo, int capacidad, int anio_fab)  throws AvionException {
        Pattern p=Pattern.compile("[[A-Z]{2}-[A-Z]{3}]");
        Matcher m;
        if (matricula.equals(null) && modelo.equals(null) && capacidad > 0 && anio_fab >0){
            m=p.matcher(matricula);
            if (m.find()) {
                this.matricula = matricula;
            }else{
                throw new AvionException("La matricula no posee el formato correcto");
            }
            this.modelo = modelo;
            this.capacidad = capacidad;
            this.anio_fab = anio_fab;
        }
        else {throw new AvionException();}
    }
}
