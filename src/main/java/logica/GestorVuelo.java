package logica;

import model.Vuelo;

import java.util.ArrayList;
import java.util.List;

public class GestorVuelo {
    List<Vuelo> vuelos = new ArrayList<Vuelo>();
    static private GestorVuelo gv;

    private GestorVuelo(ArrayList<Vuelo> arrayList) {
        vuelos = arrayList;
    }

    static public GestorVuelo getInstance() {
        if (gv == null) {
            gv = new GestorVuelo(new ArrayList<Vuelo>());
        }
        return gv;
    }

}
