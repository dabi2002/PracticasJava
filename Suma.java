/*
 * Fig. 2.7: Suma.java
 * Programa que muestra la suma de dos numeros enteros
 */

import java.util.Scanner;

public class Suma 
{
    //el método main empieza la ejecución de la aplicacion en Java
    public static void main(String[] args) {
        //crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        //declara variables
        int num1, num2;
        //muestra la ventana de comandos
        System.out.println("Introduce el primer numero entero: ");
        //lee el primer numero entero
        num1 = entrada.nextInt();
        //muestra la ventana de comandos
        System.out.println("Introduce el segundo numero entero: ");
        //lee el segundo numero entero
        num2 = entrada.nextInt();
        //muestra la ventana de comandos
        System.out.println("La suma es: " + (num1 + num2));
        //cierra la ventana de comandos
        entrada.close();
    }
}
