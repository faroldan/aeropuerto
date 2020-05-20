package com.aeropuerto.undec;

import exceptions.AerolineaException;
import logica.GestorAerolinea;
import logica.GestorAvion;
import model.Aerolinea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
12.	Cargar una aerolínea nueva
13.	Modificar una aerolínea existente
14.	Buscar aerolíneas por nombre
*/
public class aerolineaTest {
        static Calendar c=   GregorianCalendar.getInstance();
        static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        static  GestorAerolinea ga = GestorAerolinea.getInstance();
        static Aerolinea a = null;
        @Test
        public void gestorAerolinea() {
                // arrange

                GestorAerolinea ga1 = GestorAerolinea.getInstance();
                // actual
                // assert
                Assertions.assertEquals(true, ga.equals(ga1));
        }

        @Test
        public void cargarAerolinea() throws AerolineaException {

                //c.set(1980, Calendar.JANUARY, 20);
                try {
                        sdf.parse("20/01/1980");
                } catch (ParseException e) {
                        e.printStackTrace();
                }
                try {
                         a = new Aerolinea("30-43728472-3", "AR","Austral",sdf);
                         ga.AgregarAerolinea(a);

                }catch(AerolineaException ex){
                        Assertions.assertTrue(true );
                }
        }

        @Test
        public void ModificarAerolinea() {

               // c.set(1980, Calendar.JANUARY, 20);
                try {
                        sdf.parse("20/01/1980");
                } catch (ParseException e) {
                        e.printStackTrace();
                }

                Assertions.assertEquals("30-43728472-3", ga.TraerUnaAerolinea("Austral").getCuit());
                Assertions.assertEquals("AR", ga.TraerUnaAerolinea("Austral").getCodIATA());
                Assertions.assertEquals("Austral", ga.TraerUnaAerolinea("Austral").getNombre());
                Assertions.assertEquals(c, ga.TraerUnaAerolinea("Austral").getFechaInicioAct());
                c.set(1982,Calendar.JANUARY, 20);
                sdf.format(c);
                ga.ModificarAerolinea(ga.TraerUnaAerolinea("Austral"),"30-54738823-3","AR","Austral",sdf);

                Assertions.assertEquals(false, ga.TraerUnaAerolinea("Austral").getCuit());
                Assertions.assertEquals("AR", ga.TraerUnaAerolinea("Austral").getCodIATA());
                Assertions.assertEquals("Austral", ga.TraerUnaAerolinea("Austral").getNombre());
                Assertions.assertEquals(false, ga.TraerUnaAerolinea("Austral").getFechaInicioAct());
        }

        @Test
        public void BuscarAerolineaPorNombre() {

                c.set(1980, Calendar.JANUARY, 20);
                sdf.format(c);
                Assertions.assertEquals(a,ga.TraerUnaAerolinea("Austral"));
        }
}
