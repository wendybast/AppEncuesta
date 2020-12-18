/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appencuesta;

import Formulario.Formulario;

/**
 *
 * @author GALATEA
 */
/* 1. Crear clase Cliente con los siguientes atributos.
- Nombre (no puede estar vacío)
- Apellido (no puede estar vacío)
- Numero de Cliente (tiene que ser mayor a 0)

2. Crear clase Encuesta que extienda de Cliente y
   contenga los siguientes atributos y métodos.
Atributos:
- NivelAtencion(int) entre 0 y 10.
- NivelResolucion(int) entre 0 y 10.
- NivelRecomendacion(int) entro 0 y 10.

Metodos:
Promedio(NivelAtencion,NivelRecomendacion,NivelResolucion)

3. Crear interfaces (JFrame) grafica formularioCliente con todos los datos
   mencionados en el punto 1 y 2 y un botón que nos lleve al siguiente punto mostrando el resultado.

4. Crear interfaces (JFrame) para mostrar el valor promedio de la encuesta.(incluir una imagen)*/

public class AppEncuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Formulario form1= new Formulario();
        form1.setVisible(true);
 
    
    }
    
}
