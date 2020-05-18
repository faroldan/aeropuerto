package model;

import exceptions.AvionException;
import exceptions.VuelosException;

import java.util.Date;
import java.util.List;

public class Vuelo extends VuelosException {

    private String codVuelo;
    private Date salida;
    private Date arribo;
    private String aeropuertoSalida;
    private String aeropuertoArribo;
    private String avion;
    private List<Piloto> tripulacion;
    private String aerolinea;

    public Vuelo(String codVuelo, Date salida, Date arribo, String aeropuertoSalida, String aeropuertoArribo,
                 String avion, List<Piloto> tripulacion, String aerolinea) throws VuelosException {

        if (!codVuelo.equals(null) && !salida.equals(null)&& !arribo.equals(null)&& !aeropuertoSalida.equals(null)&&
                !aeropuertoArribo.equals(null) && !avion.equals(null) && !tripulacion.isEmpty() && !aerolinea.equals(null)) {
            this.codVuelo = codVuelo;
            this.salida = salida;
            this.arribo = arribo;
            this.aeropuertoSalida = aeropuertoSalida;
            this.aeropuertoArribo = aeropuertoArribo;
            this.avion = avion;
            this.tripulacion = tripulacion;
            this.aerolinea = aerolinea;
        }
        else{throw new VuelosException();}
    }
}
