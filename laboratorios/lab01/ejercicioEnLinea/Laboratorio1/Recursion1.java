
/**
 * Alejandra Martinez Vega
 */
//2.1
public class Recursion1
{
    public static int factorial(int n) {
        if(n==0){
            return 1;
        }else{
            return n*(factorial(n-1));
        }
    }

    public static int fibonacci(int n) {
        if(n<=1){
            return n;
        }else{
            return (fibonacci(n-2)+ fibonacci(n-1));
        }
    }

    public static int bunnyEars(int bunnies) {  
        if(bunnies == 0){                       
            return 0;                           
        }else{
            return 2+(bunnyEars(bunnies-1));    
        }
    }

    public int bunnyEars2(int bunnies) {
        if(bunnies == 0){                       
            return 0;                          
        }else if(bunnies % 2 == 1){             
            return 2 + bunnyEars2(bunnies-1);   
        }else {
            return 3 + bunnyEars2(bunnies-1);   
        }
    }

    public int triangle(int rows) {
        if(rows == 0){          
            return 0;          
        }else{
            return rows + 1 * (triangle(rows-1));    
        }
    }
}
