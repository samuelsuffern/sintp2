package p2;

import java.util.ArrayList;

public class Programacion {
        private String fecha="";

        private ArrayList<Canal> canales = new ArrayList<Canal>();

    public Programacion(){}
    public Programacion(String fecha,ArrayList<Canal> canales) {
        this.fecha = fecha;
        this.canales = canales;
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public ArrayList<Canal> getCanales() {
        return canales;
    }

    public void setCanales(ArrayList<Canal> canales) {
        this.canales = canales;
    }

}
