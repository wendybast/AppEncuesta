/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author GALATEA
 */
public class encuesta extends cliente {

    private String nAtencion;
    private String nResolucion;
    private String nRecomendacion;

    public encuesta(String nAtencion, String nResolucion, String nRecomendacion) {
        this.nAtencion = nAtencion;
        this.nResolucion = nResolucion;
        this.nRecomendacion = nRecomendacion;
    }

    public void setnAtencion(String nAtencion) {
        this.nAtencion = nAtencion;
    }

    public void setnResolucion(String nResolucion) {
        this.nResolucion = nResolucion;
    }

    public void setnRecomendacion(String nRecomendacion) {
        this.nRecomendacion = nRecomendacion;
    }

    public String getnAtencion() {
        return nAtencion;
    }

    public String getnResolucion() {
        return nResolucion;
    }

    public String getnRecomendacion() {
        return nRecomendacion;
    }

   
    
   
}
