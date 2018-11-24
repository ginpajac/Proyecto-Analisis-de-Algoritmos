package ec.espol.edu.algoritmosOrdenamiento;

/*
*
* Algoritmo de ordenación InsertSort en Java
* Recuperado de: https://www.geeksforgeeks.org/insertion-sort/
* Fecha: 24/11/2018
*/
public class InsertionSort {
    
    int array[];

    public InsertionSort(int l[]){
        array = l;
    }
    
    public int[] insertionSort(int arr[]) { 
        int i, key, j;
        
        for (i = 1; i < arr.length; i++){ 
            
            key = arr[i]; 
            j = i-1;
            
            /*Mueve el elemento del array[0..i-1] que sea mayor a key*/
            while (j >= 0 && arr[j] > key) 
            {
                /*mueve el elemento una posicion arriba 
                de su posicion inicial*/
                arr[j+1] = arr[j]; 
                j = j-1; 
            }
            
            arr[j+1] = key; 
        }
        
        return arr;
    }
    
    //Metodo que calcula el tiempo del insertionSort
    public long insertionTimer(){
        
        long init, end, time;
        
        init = System.currentTimeMillis();
        insertionSort(array);
	end = System.currentTimeMillis();
	time = (end - init);
        
        System.out.println("Tiempo de Insertion Sort :"+time + " ms");
		
	return time;
    }
}