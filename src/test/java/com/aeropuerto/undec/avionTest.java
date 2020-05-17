package com.aeropuerto.undec;

import logica.GestorAvion;
import logica.GestorVuelo;
import model.Avion;
import model.Vuelo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
1.	Cargar un avión nuevo
2.	Modificar un avión existente
3.	Consultar los aviones
4.	Buscar un avión por matrícula
5.	Consultar horas de vuelo de un avión
* */

public class avionTest {
    @Test
    public void gestorAvion(){
        GestorAvion ga = GestorAvion.getInstance();
        GestorAvion ga1 = GestorAvion.getInstance();

        // assert
        Assertions.assertEquals(true, ga.equals(ga1));
        Assertions.assertEquals(true, ga=ga1);
    }
    @Test
    public void cargarAvion(){
        // arrange
        GestorAvion ga = GestorAvion.getInstance();
        Avion a1 = new Avion("LV-AFD", "Airbus A340",150,1980);
        Avion a2 = new Avion();


        // actual
        gv.addProducto(z1);
        gv.addProducto(z2);


        // assert
        Assertions.assertEquals(1, v1.BuscarProducto(1));
        Assertions.assertEquals(2, v1.BuscarProducto(2));
    }
    @Test
    public void modificarAvion(){
    }
    @Test
    public void consultarAvion(){
    }
    @Test
    public void consultarXMatricula(){
    }
    @Test
    public void consultarHorasAvion(){

    }
}
