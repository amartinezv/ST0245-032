import java.util.Random;
import java.util.Arrays;
public class arraysum
{
    
     /**
     * calcula la suma de un arreglo
     * 
     * @param  A    arreglo de enteros
     * @return     sum  la suma de los elementos del arreglo
     */
    public static int ArraySum(int[] A)
    {          
        int sum = 0;
        for (int i = 0; i < A.length; i++)
            sum = sum + A[i];
        return sum;
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
        ArraySum(arreglo);
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
    

}
