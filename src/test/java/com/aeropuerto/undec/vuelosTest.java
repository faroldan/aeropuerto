package com.aeropuerto.undec;

import logica.GestorVuelo;
import model.Vuelo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.AssertEquals.assertEquals;

/*funcionalidades a testear
19.	Cargar nuevos vuelos
20.	Cambiar un avión de un vuelo
21.	Cambiar el comandante de un vuelo
22.	Cambiar el copiloto de un vuelo
23.	Cambiar fechas del vuelo (reprogramar)
24.	Buscar vuelos por fecha
25.	Buscar vuelos por aerolínea

* */
public class vuelosTest {
    @Test
    public void gestorVuelos(){
        // arrange
        GestorVuelo gv = GestorVuelo.getInstance();
        Vuelo v1 = new Vuelo(1, "nauticos", new Precio(134.2), Genero.MASCULINO);
        Vuelo v2 = new Vuelo(2, "mocasin", new Precio(1500), Genero.FEMENINO);


        // actual
        gv.addProducto(z1);
        gv.addProducto(z2);


        // assert
        Assertions.assertEquals(1, v1.BuscarProducto(1));
        Assertions.assertEquals(2, v1.BuscarProducto(2));

    }
    @Test
    public void cargarVuelos(){
    }
    @Test
    public void cambiarAvionVuelo(){
    }
    @Test
    public void cambiarCommanderVuelo(){
    }
    @Test
    public void cambiarCopilotoVuelo(){
    }
    @Test
    public void reprogramarVuelo(){
    }
    @Test
    public void retornaVueloXFecha(){
    }
    @Test
    public void retornaVueloXAerolinea(){
    }
}
