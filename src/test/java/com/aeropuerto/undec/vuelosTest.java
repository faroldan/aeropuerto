package com.aeropuerto.undec;

import logica.GestorVuelo;
import model.Piloto;
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
        Piloto p1= new Piloto();
        Piloto p2= new Piloto();
        GestorVuelo gv = GestorVuelo.getInstance();
        Vuelo gv = new Vuelo("AR 1234", "","","","","",
                "","");
        Vuelo gv1 = new Vuelo();

        // assert
        Assertions.assertEquals(true, gv.equals(gv1));
        Assertions.assertEquals(true, gv=gv1);

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
