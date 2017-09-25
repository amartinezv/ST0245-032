
/**
 *  Solicitud here.
 * 
 * @author ALEJANDRA MARTINENEZ VEGA  -- JOHANNA SARAI CAICEDO MEJIA 
 */
import java.util.*;
public class Solicitud{
    private final String nombre;
    private final int numNeveras;

    public Solicitud(String nombre, int numNeveras){
        this.nombre = nombre;
        this.numNeveras = numNeveras;
    }

    public String getNombre(){
        return nombre;
    }

    public int getNumNeveras(){
        return numNeveras;
    }

    public String toString(){
        return "( " + nombre + ", " + numNeveras + " )";
    }
}
