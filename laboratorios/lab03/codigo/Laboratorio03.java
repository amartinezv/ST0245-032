
/**
 *  class Laboratorio03
 * 
 * @author  ALEJANDRA MARTINENEZ VEGA  -- JOHANNA SARAI CAICEDO MEJIA
 */
import java.util.*;
public class Laboratorio03
{
    /**
     * Returns the product of the numbers in the list. 
     * @param list - List of integers.
     * @return An integer.
     */
    public static int multiplyList(LinkedList<Integer> list) {
        int mult = 1;
        for(int i = 0; i < list.size(); ++i){
            mult = mult * list.get(i);
        }
        return mult;
    }

    /**
     * Returns the product of the numbers in the list. 
     * @param Array - Array of integers.
     * @return An integer.
     */
    public static int multiplyArray(ArrayList<Integer> list) {
        int mult = 1;
        for(int i = 0; i < list.size(); ++i){
            mult = mult * list.get(i);
        }
        return mult;
    }

    public static LinkedList<Integer> SmartInsert(LinkedList<Integer> list, int data){
        boolean a = list.contains(data);
        if(a == false){
            list.add(data);
        } else {
            System.out.println("El elemento ya existe");
        }
        return list;
    }
    
    public static ArrayList<Integer> SmartInsert(ArrayList<Integer> list, int data){
        boolean a = list.contains(data);
        if(a == false){
            list.add(data);
        } else {
            System.out.println("El elemento ya existe");
        }
        return list;
    }

    public static int pivote(LinkedList<Integer> list){
        int i = 0, min = 0, rest = 0, sum1 = 0, sum2 = 0, pivote=0;
        while(i != list.size()){
            for(int a = 0; a < i; ++a){
                sum1 += list.get(a);
            }
            for(int b = i+1; b < list.size(); ++b){
                sum2 += list.get(b);
            }
            rest = Math.abs(sum1 - sum2);
            if(i == 0){
                min = rest;
            }         
            sum1 = 0;
            sum2 = 0;
            if(rest < min){
                min = rest;
                pivote = i;
            }
            ++i;
        }
        System.out.println("EL pivote debe ir en la posicion: " + pivote);
        return pivote;
    }
    
    public static void ejercicio4(Stack<Almacen> neveras, Queue<Solicitud> solicitudes){
        while(!solicitudes.isEmpty()){
            Solicitud s1 = solicitudes.poll();
            System.out.print("( " + s1.getNombre()+ ",[ ");
            int i = s1.getNumNeveras();
            while(i > 0 && !neveras.isEmpty()){
                Almacen a1 = neveras.pop();
                System.out.print(a1.toString() + ",");
                --i;
            }
            System.out.print("])");
            System.out.println();
        }
    }
    
    /**
     * Tests the methods.
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> linked = new LinkedList<>();
        linked.addAll(Arrays.asList(new Integer[] {1, 3, 5, 7}));

        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[] {2, 4, 6, 8}));

        //Multiply
        System.out.println("MULTIPLY");
        System.out.println(multiplyList(linked));
        System.out.println(multiplyArray(array));
        
        //SmartInsert
        System.out.println("SMART INSERT");
        System.out.println(SmartInsert(linked, 4));
        System.out.println(SmartInsert(array, 4));
        
        //pivote
        System.out.println("PIVOTE");
        LinkedList<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(new Integer[] {10,20,5,3,20}));
        pivote(list);
        
        //Neveras
        System.out.println("NEVERAS");
        Stack<Almacen> neveras = new Stack();
        neveras.push(new Almacen(1,"HACEB"));
        neveras.push(new Almacen(2,"LG"));
        neveras.push(new Almacen(3,"IBM"));
        neveras.push(new Almacen(4,"HACEB"));
        neveras.push(new Almacen(5,"LG"));
        neveras.push(new Almacen(6,"IBM"));
        neveras.push(new Almacen(7,"HACEB"));
        neveras.push(new Almacen(8,"LG"));
        neveras.push(new Almacen(9,"IBM"));
        neveras.push(new Almacen(8,"LG"));
        neveras.push(new Almacen(9,"IBM"));
        Queue<Solicitud> solicitudes = new LinkedList<>();
        solicitudes.add(new Solicitud("EXITO", 1));
        solicitudes.add(new Solicitud("OLIMPICA", 4));
        solicitudes.add(new Solicitud("LA14", 2));
        solicitudes.add(new Solicitud("EAFIT", 10));
        ejercicio4(neveras, solicitudes);
    }
}
