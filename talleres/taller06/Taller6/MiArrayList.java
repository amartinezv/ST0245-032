/**
 * Taller 6
 * Johanna Sarai Caicedo Mejia 
 * Alejandra Martinez Vega
 */

   import java.util.Arrays;

public class MiArrayList
{
        private int size;
        private static final int DEFAULT_CAPACITY = 10;
        private int elements[];
        
        public MiArrayList() {
            this.size = 0;
            this.elements = new int[DEFAULT_CAPACITY];
        }
        
        public int size() {
             return size;
        }
        
        public void add(int e) {
             elements[size] = e;
             size++;
        }
        
        public int get(int i) {
            return elements[i];
        }
        
        public void add(int index, int e) {
            for(int i=elements.length-1;i>=index; i-- ){
                elements[i]= elements[i-1];
            }
            elements[index] = e;
        }
        
}


