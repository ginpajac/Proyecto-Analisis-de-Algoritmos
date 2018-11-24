
package ec.espol.edu.algoritmosOrdenamiento;


/*
*
* Algoritmo de ordenación MergeSort en Java
* Recuperado de: http://www.solveet.com/exercises/Algoritmo-de-ordenacion-merge-sort/158/solution-1123
* Fecha: 17/11/2018
*/

public class MergeSort {
    
    int[] array;
    
    
    public MergeSort(int []n){
        array = n;
    }       
	
    private  int[] mergeSort(int []n){ 
        int i = 1;

        for(i = 1; i < n.length; i*=2){ 
          for(int j = 0; j < n.length; j += i){ 
            int p = i >> 1; 
            merge(n, j, j + p-1, j + p, j + p + p - 1); 
          } 
        } 
        merge(n, 0, i/2 - 1, i/2, n.length); 
        return n; 
    } 

	private void merge(int [] n, int a, int b, int c, int d){ 
	    d = Math.min(d, n.length-1);    
	    int mer [] = new int[d - a + 1]; 
	    int idx = 0; 
	    int or = a; 
	    
	    while(idx < mer.length){
	      if((a > b ?false: (c > d ?true: n[a] <= n[c]))){ 
	        mer[idx++] = n[a++];         
	      
	      }else{ 
	        mer[idx++] = n[c++];  
	      }
	    }
	       
	    for(int i = 0; i < mer.length; i++){
	      n[or + i] = mer[i];
	    }
	}
	
	/* Método que calcula el tiempo del mergesort */
	public long mergeTimer(){
		long init, end, time;
		
		init = System.currentTimeMillis();
		mergeSort(array);
		end = System.currentTimeMillis();
		time = (end - init);
		
		System.out.println("Tiempo de merge Sort :"+time + " ms");
		
		return time;
	}
	
	
}


