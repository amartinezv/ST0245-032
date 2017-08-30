
/**
 * Alejandra Martinez Vega 
 * Johanna Sarai Caicedo Mejia 
 */
public class Lista {
      Nodo inicio; 
       
       public class Nodo {    
           int data;     
           Nodo siguiente; 
           
           public Nodo(int data){    
               this.data = data;
           }
       }  
       
       public Lista(){ 
           inicio= null;
       } 
       
       public void agregar(int n) {  
           Nodo nuevo = new Nodo(n);
           if (inicio != null) {
               nuevo.siguiente = inicio; 
               inicio= nuevo;      
           } 
           else { 
               inicio = nuevo;
           }
       }
       
       public void imprimir() {
           Nodo temp = inicio;
           while(temp != null){
               System.out.println(temp.data);
               temp = temp.siguiente;
            }
       } 
       
       
       public void agregar_al_inicio(int n) {
            Nodo nuevo = new Nodo(n);
           if (inicio != null) {
               nuevo.siguiente = inicio; 
               inicio= nuevo;      
           } 
           else { 
               inicio = nuevo;
           }
       }
       
       
       
       //Punto 2-a Imprimir los elementos de la lista en orden inverso
       public void imprimir_inverso() { 
           Nodo nodo = inicio;
           int i = 0;
           while(nodo != null){
               nodo = nodo.siguiente;
               i++;
           }
           for(int k = i - 1; k > 0; k--){
               imprimir(k);
            }
       }
       
       
       //Punto 2-b Imprimir el valor que se encuentre en la posición n. 
       public void imprimir(int n) { 
           Nodo temp = inicio;
           int pos = 0;
           while(temp != null){
               if(pos == n){
                   System.out.println(temp.data);
                }
            }
            temp = temp.siguiente;
            pos++;
       }  
 
       
       //Punto 2-d Eliminar el primer nodo de una lista 
       public void borrarInicio() { 
           inicio = inicio.siguiente;
       }
       
       
       //Punto 3 Comparar el contenido de dos listas.
       public boolean comparar(Lista lista) {  
           Nodo nodo1 = inicio;
           Nodo nodo2 = lista.inicio;
           while(nodo1 != null){
               if(nodo2 == null || nodo1.data != nodo2.data)
                    return false;
               nodo1 = nodo1.siguiente;
               nodo2 = nodo2.siguiente;
           }
           if(nodo2 != null)
                return false;
           return false;
       }  
       
      public static void main(String[] args){
          Lista lista = new Lista();
          lista.agregar(1);
          lista.agregar(2);
          lista.imprimir(0);
          lista.imprimir_inverso();
          lista.imprimir();
          lista.borrarInicio();
          lista.comparar(lista);
       }
}