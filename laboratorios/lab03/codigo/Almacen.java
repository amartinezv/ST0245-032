
/**
 *  class Almacen 
 * 
 * @author ALEJANDRA MARTINENEZ VEGA  -- JOHANNA SARAI CAICEDO MEJIA
 */
public class Almacen
{
    private int codigo;
    private String marca;

    public Almacen(int codigo, String marca){
        this.codigo = codigo;
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public int getCodigo(){
        return codigo;
    }

    public String toString(){
        return "( " + codigo + ", " + marca + " )";
    }
}
