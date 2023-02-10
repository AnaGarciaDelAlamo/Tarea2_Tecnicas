/*Escriba un algoritmo que calcule la velocidad media de desplazamiento del usuario.

A continuación, se muestra un ejemplo de posibles visualizaciones y entradas durante una ejecución del algoritmo (los valores introducidos por el usuario están escritos en negrita y cursiva):

Introduzca la distancia recorrida (km).

370

Introduzca el tiempo del recorrido (min).

240

Se ha desplazado a una velocidad de 92,5 km/h.

 */

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        // TODO code application logic here
        double distancia, tiempo, velocidad;//se declaran las variables
        distancia = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la distancia recorrida (km)."));//se le asigna el valor que se ingrese por teclado a la variable distancia
        tiempo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el tiempo del recorrido (min)."));//se le asigna el valor que se ingrese por teclado a la variable tiempo
        velocidad = (distancia / tiempo) * 60;//se le asigna el valor de la division de distancia entre tiempo y se multiplica por 60 a la variable velocidad
        System.out.println("Se ha desplazado a una velocidad de " + velocidad + " km/h.");//se imprime el valor de la variable velocidad
    }
}