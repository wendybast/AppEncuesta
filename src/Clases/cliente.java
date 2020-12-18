/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import javax.swing.*;
       

/**
 *
 * @author GALATEA
 */
/*1. Crear clase Cliente con los siguientes atributos.
- Nombre (no puede estar vacío)
- Apellido (no puede estar vacío)
- Numero de Cliente (tiene que ser mayor a 0)*/
public class cliente {

    private String nombre;
    private String apellido;
    private String numCliente ="";

    public cliente() {
    }

    //constructores
    public cliente(String nombre, String apellido, String numCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCliente = numCliente;
    }
    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    
    }
    
    

