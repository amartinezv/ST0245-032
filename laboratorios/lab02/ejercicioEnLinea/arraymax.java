import java.util.Arrays;
import java.util.Random;
public class arraymax
{
    
   /**
     * Calcula el valor maximo de un arreglo
     * 
     * @param  A    arreglo de enteros
     * @return     max  elemento mas grande del arreglo
     */
   public static int ArrayMax(int[] A)
  {
      int max = A[0];
      for (int i = 0; i < A.length; i++)
         if (A[i] > max)
           max = A[i];
      return max;
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
        ArrayMax(arreglo);
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
}
