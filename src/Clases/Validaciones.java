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
public class Validaciones {

    //validamos que el ingreso de los campos no este vacio
    public boolean vacio(String palabra) {
        if (palabra.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    //Se valida que sea mayor a 0
    public boolean esMayor(String listado) {
        int numero = Integer.parseInt(listado);
        if (numero > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* public boolean validarNumCliente(int numCliente){
        if(numCliente > 0){
            return true;
        }
        return false;
    }   */
}
