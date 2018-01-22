/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerfinal;

/**
 *
 * @author Carlitos
 */
public class CalculaTiempo {

    private long tiempo;

    public CalculaTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public long tiempo() {
        //long tiempo = 0;
        long hora = getTiempo() / 3600000;
        long min = getTiempo() / 60000;
        long seg = getTiempo() / 1000;
        System.out.println("Tiempo>> " + hora + " : " + min + " : " + seg + " : " + getTiempo());        
        return 0;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s",
                tiempo());

        return cadena;
    }

}
