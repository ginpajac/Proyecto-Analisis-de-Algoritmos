/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espol.edu.main;

import ec.espol.edu.algoritmosOrdenamiento.Utilidad;
import ec.espol.edu.algoritmosOrdenamiento.QuickSort;
import ec.espol.edu.algoritmosOrdenamiento.InsertionSort;
import ec.espol.edu.algoritmosOrdenamiento.MergeSort;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ginger Jacome
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ///NumerosRandom num= new NumerosRandom();
        //num.ListaRandom(100);
        Utilidad u= new Utilidad(100000);
        int[] nArr =u.obtenerCopiaArray();
        int[] nArr2 =u.obtenerCopiaArray();
        int[] nArr3 =u.obtenerCopiaArray();
        u.crearTxT("datos42.txt");
        MergeSort mergesort=  new MergeSort(nArr);
        QuickSort quicksort= new QuickSort(nArr2);
        InsertionSort ins= new InsertionSort(nArr3);
        quicksort.quickTimer();
                ins.insertionTimer();
        mergesort.mergeTimer();
        String arch="C:\\Users\\Ginger Jacome\\Desktop\\Gin\\Analisis de Algoritmos\\Proyecto-Analisis-de-Algoritmos\\Analisis\\datos.txt";
        leertxt(new File(arch), 1000);
        
    }
    public static int[] leertxt(File archivo, int cant) throws FileNotFoundException{
        int[] datos = null;
        int cnt=0;
        try (Scanner sc = new Scanner(archivo)) {
            while(sc.hasNextLine()) {
                datos[cnt]= Integer.parseInt(sc.nextLine());
                cnt++;
                System.out.println();
            }
        }
        if(cant>=datos.length){
            return datos;
        }
        else{
            int[] newArray = Arrays.copyOfRange(datos, 0, cant);
            return newArray;
        }
    }
    
}
