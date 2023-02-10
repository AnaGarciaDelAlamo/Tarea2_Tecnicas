/*¿Qué hace este algoritmo?

        Algo QueHace
        # ¿Qué hace este algoritmo?
        Variable valor1, valor2: real
        Inicio
        valor1 <- enter("Introduza un valor: ")
        valor2 <- enter("Introduza otro valor: ")
        # tratamiento
        valor1 <- valor2
        valor2 <- valor1
        escribir("valor1 = " & valor1 & "; valor2 = " & valor2)
        Fin
*/

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        // TODO code application logic here
        double valor1, valor2;//se declaran las variables
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza un valor: "));//se le asigna el valor que se ingrese por teclado a la variable valor1
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza otro valor: "));//se le asigna el valor que se ingrese por teclado a la variable valor2
        //tratamiento
        valor1 = valor2;//se le asigna el valor de la variable valor2 a la variable valor1
        valor2 = valor1;//se le asigna el valor de la variable valor1 a la variable valor2
        System.out.println("valor1 = " + valor1 + "; valor2 = " + valor2);//se imprime el valor de las variables valor1 y valor2 que es el mismo valor que se ingreso por teclado
    }
}