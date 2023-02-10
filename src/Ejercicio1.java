/*¿Cuáles serán los valores de las variables a y b después de cada línea del siguiente algoritmo?

        Algo ValoresDeLasVariables
        variable a, b: entero
        Inicio
        a <- 3
        escribir("a = " & a)
        b<-a+5
        escribir("a = " & a & " y b = " & b)
        a<-7
        escribir("a = " & a & " y b = " & b)
        Fin

   */

public class Ejercicio1 {
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;//se declaran las variables
        a = 3;//se le asigna el valor 3 a la variable a
        System.out.println("a = " + a);//se imprime el valor de la variable a
        b = a + 5;//se le asigna el valor de la suma de a y 5 a la variable b
        System.out.println("a = " + a + " y b = " + b);//se imprime el valor de la variable a y b que es 3 y 8
        a = 7;//se le asigna el valor 7 a la variable a
        System.out.println("a = " + a + " y b = " + b);//se imprime el valor de la variable a y b que es 7 y 8
    }
}
