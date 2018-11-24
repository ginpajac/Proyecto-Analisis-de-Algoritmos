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

/**
 *
 * @author Ginger Jacome
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ///NumerosRandom num= new NumerosRandom();
        //num.ListaRandom(100);
        Utilidad u= new Utilidad(100000);
        int[] nArr =u.obtenerCopiaArray();
        u.crearTxT("datos.txt");
        MergeSort mergesort=  new MergeSort(nArr);
        QuickSort quicksort= new QuickSort(nArr);
        InsertionSort ins= new InsertionSort(nArr);
        mergesort.mergeTimer();
        quicksort.quickTimer();
        ins.insertionTimer();
    }
    
}
