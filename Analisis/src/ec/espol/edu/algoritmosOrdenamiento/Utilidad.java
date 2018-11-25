package ec.espol.edu.algoritmosOrdenamiento;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utilidad {
	
	int []lista;
	Random randomm = new Random();
	
	/* Metodo que permite generar un arreglo de n mumero de 
	 * enteros (entre 1 y n).
	 */
        public Utilidad(int[] list){
            lista=list;
        }
	public Utilidad(int num){
            lista = new int [num];
            for (int i = 0; i < lista.length; i++) {
                lista[i] = (int)(Math.random() * num + 1);
            }
            //System.out.println(lista.toString());
	}
	
	/* Metodo que permite imprimir el arreglo */
	public void imprimirArray(int []ar){
		System.out.println(Arrays.toString(ar));
	}
	
	/*Metodo que permite tener una copia del arreglo original */
	public int[] obtenerCopiaArray(){
            int[] copiaArray = lista.clone();
            return copiaArray;
	}
	
    public void crearTxT(String archivo){
    try{
        File f =new File(archivo);
        FileWriter escritor = new FileWriter (f,true);
        try (BufferedWriter A = new BufferedWriter(escritor); PrintWriter salida = new PrintWriter(A)) {

            for (int i = 0; i < obtenerCopiaArray().length; i++)
                salida.write(obtenerCopiaArray()[i]+"\r\n");
            }
        } catch (Exception e) {}
    }
	
    
}
