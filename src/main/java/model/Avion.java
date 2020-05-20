package model;

import exceptions.AvionException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Avion extends AvionException{
    private String matricula;
    private String modelo;
    private int capacidad;
    private int anio_fab;
    Pattern p=Pattern.compile("[[A-Z]{2}-[A-Z]{3}]");
    Matcher m;
    public Avion(String matricula, String modelo, int capacidad, int anio_fab)  throws AvionException {

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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula)  throws AvionException {
        m=p.matcher(matricula);
        if (m.find()) {
            this.matricula = matricula;
        }else{
            throw new AvionException("La matricula no posee el formato correcto");
        }

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAnio_fab() {
        return anio_fab;
    }

    public void setAnio_fab(int anio_fab) {
        this.anio_fab = anio_fab;
    }
}
