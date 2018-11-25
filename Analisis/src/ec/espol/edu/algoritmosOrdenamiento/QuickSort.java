
package ec.espol.edu.algoritmosOrdenamiento;

/*
* 
* Algoritmo de QuickSort en Java
* Recuperado de: http://www.java2novice.com/java-sorting-algorithms/quick-sort/
* Fecha: 17/11/2018
*/

public class QuickSort {
    int arreglo[];
    int longitud;
    
    public QuickSort(int l[]){
      arreglo = l;
    } 
 
    public void sort(int[] arr){	
        if (arr == null || arr.length == 0){
            return;
        }
        
        arreglo = arr;
        longitud = arr.length;
        quickSort(0, longitud - 1);
    }

    private void quickSort(int lInd, int hInd){
        int i = lInd;
        int j = hInd;
        
        //Calcula el pivote
        int pivote = arreglo[lInd+(hInd - lInd)/2];
        
        //Se divide en dos arreglos
        while (i <= j) {
            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            if (i <= j) {
                intercambiarNums(i, j);
                i++;
                j--;
            }
        }
        
        //Llama al método recursivo quicksort
        if (lInd < j)
            quickSort(lInd, j);
        
        if (i < hInd)
            quickSort(i, hInd);
    }
 
    private void intercambiarNums(int i, int j) {
        int temporal = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temporal;
    }
    
    /* Método que calcula el tiempo de ejecución */
    public long quickTimer(){
    	long inicio, fin, time;
    	
        inicio = System.currentTimeMillis();
        sort(arreglo);
        fin = System.currentTimeMillis();

        time = (fin - inicio);

        System.out.println("Tiempo de Quick : "+time + " ms");

        return time;
    }
    
    public void calculaPorPartes(){
        int cnt = arreglo.length;
        
    }

}
