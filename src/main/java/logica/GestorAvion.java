package logica;

import model.Avion;

import java.util.ArrayList;
import java.util.List;

public class GestorAvion {
    List<Avion> aviones= new ArrayList<Avion>();
    static private GestorAvion ga;

    private GestorAvion(ArrayList<Avion> arrayList) {
        aviones = arrayList;
    }

    static public GestorAvion getInstance() {
        if (ga == null) {
            ga = new GestorAvion(new ArrayList<Avion>());
        }
        return ga;

    }
}
