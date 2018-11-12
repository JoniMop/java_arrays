/*
 * Nombre: Comparo indices de 2 arreglos
 * Descripcion: Haga una función que reciba dos arreglos de enteros y que retorne true si los arreglos son iguales o false si no. Pruébela en un programa
 * Fecha: 10/Noviembre/2018
 * Autor: Jonatan Gur-Ari
 */
package ejercicios;
 import java.io.*;
/**
 *
 * @author jonatangur-ari
 */
public class Comparo_IndicesDe2Arreglos {
    
    //Aqui van las constantes y las variables de control de flujo de entrada y salida
    public static BufferedReader leer = new BufferedReader(
            new InputStreamReader(System.in));
    public static PrintStream imprimir = System.out;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int[] arreglo1 = {200, 500, 400, 800, 1000}; // Ejercicio 7, este es un arreglo de enteros, una variable contenedora
        int[] arreglo2 = {200, 500, 700, 800, 1000}; // este es el segundo arreglo de enteros, una variable contenedora

        
        funcionComparo(arreglo1, arreglo2);
        
    }
    
    public static int funcionComparo(int[] parreglo1, int[] parreglo2) throws IOException {

        imprimir.println("Segun consigna #7 paso a comparar indices de 2 arreglos ");

        int igual = 0;
        
        for (int i = 0; i < parreglo1.length && i < parreglo2.length; i++) {
            if (parreglo1[i] == parreglo2[i]) {
                igual++; 
            }
        }
        imprimir.println(igual);
        return igual;
}
