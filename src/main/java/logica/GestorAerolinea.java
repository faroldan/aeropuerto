package logica;

import exceptions.AerolineaException;
import model.Aerolinea;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GestorAerolinea {
    List<Aerolinea> aerolineas= new ArrayList<Aerolinea>();
    static private GestorAerolinea ga;

    private GestorAerolinea(ArrayList<Aerolinea> arrayList) {
        aerolineas = arrayList;
    }

    static public GestorAerolinea getInstance() {
        if (ga == null) {
            ga = new GestorAerolinea(new ArrayList<Aerolinea>());
        }
        return ga;

    }

    public boolean AgregarAerolinea(Aerolinea data){
        if (!data.equals(null)){
                 aerolineas.add(data);
                    return true;}
        else
            return false;
    }

    public boolean ModificarAerolinea(Aerolinea mod, String cuit, String CodIATA, String nombre, Date fechaInicioAct){
        for (Aerolinea a: aerolineas){
            if (a.equals(mod)){
                    a.setCuit(cuit);
                    a.setCodIATA(CodIATA);
                    a.setNombre(nombre);
                    a.setFechaInicioAct(fechaInicioAct);
                return true;
            }
        }
        return false;
    }
    public boolean BorrarAerolinea(Aerolinea mod){
        for (Aerolinea a: aerolineas) {
            if (a.equals(mod)){
                aerolineas.remove(mod);
                return true;
            }
        }
        return false;
    }
    public Aerolinea TraerUnaAerolinea(String filtro){
        for (Aerolinea a: aerolineas){
            
        }

        return a;
    }
    public List<Aerolinea> TraerTodasAerolinea(){

        return aerolineas;
    }
    public Aerolinea TraerPorCriterioAerolinea(String filtro){
        Aerolinea a;
        return a;
    }
}
