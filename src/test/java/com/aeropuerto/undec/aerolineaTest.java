package com.aeropuerto.undec;

import logica.GestorAerolinea;
import logica.GestorAvion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
12.	Cargar una aerolínea nueva
13.	Modificar una aerolínea existente
14.	Buscar aerolíneas por nombre
*/
public class aerolineaTest {

        @Test
        public void gestorAerolinea() {
                // arrange
                GestorAerolinea ga = GestorAerolinea.getInstance();
                GestorAerolinea ga1 = GestorAerolinea.getInstance();
                // actual
                // assert
                Assertions.assertEquals(true, ga.equals(ga1));
        }

        @Test
        public void cargarAerolinea() {
        }

        @Test
        public void cambiarAerolinea() {
        }
}
