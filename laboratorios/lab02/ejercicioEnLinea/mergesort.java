
import java.util.Arrays;
import java.util.Random;
public class mergesort
{
    
     /**
     * Ordena una matriz usando Merget Sort
     * 
     * @param  A    arreglo de enteros
     * @return     max  elemento mas grande del arreglo
     */
    public static void mergeSort(int [ ] a)
	{
		int[] tmp = new int[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
		
	}

	private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}


    private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
            
            
    }
    
    /**
     * crea un arreglo aleatorio
     * 
     * @param  n    entero
     * @return     array arreglo aleatorio
     */
    public static int[] crearArreglo(int n) {
        int max = 10000;
        int[] array = new int[n];
        Random generator = new Random();
        for (int i =0; i<n; i++)
            array[i] = generator.nextInt(max);
        return array;
    } 

    /**
     * Toma el tiempo que dura en ejecutarce el metodo ArrayMax
     * 
     * @param  n    entero
     * @return     estimatedTime long
     */
    public static long tomarTimepo(int n){
        int [] arreglo = crearArreglo(n);
        long startTime = System.currentTimeMillis();
        mergeSort(arreglo);
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
}
