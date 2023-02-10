/*¿Qué veremos al ejecutar el siguiente algoritmo?

Algo QueVeremos
# ¿Qué veremos al ejecutar el siguiente algoritmo?
Variable valor1, valor2: entero
Variable cadena1: texto
Constante CST: real <- 49,78
Inicio
   valor1 <- 92 % 8
   valor2 <- 2 * valor1
   cadena1 <- "Test"
   escribir(cadena1 & " , valor2 = " & valor2)
   escribir(valor1 & " # " & CST)
Fin
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1, valor2;//se declaran las variables
        String cadena1;//se declara la variable
        final double CST = 49.78;//se declara la constante
        valor1 = 92 % 8;//se le asigna el valor de 4 a la variable valor1
        valor2 = 2 * valor1;//se le asigna el valor de 8 a la variable valor2
        cadena1 = "Test";//se le asigna el valor Test a la variable cadena1
        System.out.println(cadena1 + " , valor2 = " + valor2);//se imprime el valor de la variable cadena1 y valor2 que es Test y 8
        System.out.println(valor1 + " # " + CST);//se imprime el valor de la variable valor1 y CST que es 4 y 49.78
    }
}