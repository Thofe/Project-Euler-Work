import java.util.ArrayList;
import java.lang.Integer;


/**
 * Write a description of class Source here.
 *
 * @author Blake Mitrick
 * @version v8.24.18
 */
public class Source
{
    public static void main(){
        int total = fibonacciFourMillion(4000000);
        
        System.out.println(total);
    }
    
    /**
     * counts the sum of all multiples of 3 and 5 up to a given point
     * 
     * @param upUntil the number it checks the multiples up to
     * 
     * @return 
     */
    public static int threeFiveSums(int upUntil){
        int counter = 1;
        int sum = 0;
        
        while (counter < upUntil){
            if (counter % 5 == 0){
                sum += counter;
            }else if (counter % 3 == 0){
                sum += counter;
            }
            
            counter += 1;
        }
        
        return sum;
    }
    
    /**
     * counts the sums of all the even-valued terms of a fibonacci sequence whose values do not exceed a given point
     * 
     * @param upUntil the number it does the sequence up until
     * 
     * @return the sum of the even termed fibonacci numbers UpUntil
     */
    public static int fibonacciFourMillion(int upUntil){
        int sum = 0;
        
        ArrayList<Integer> list = fibCalculator(upUntil);
        
        for (Integer x: list){
            if (x % 2 == 0){
                sum += x;
            }
        }
        
        return sum;
    }
    
    /**
     * calculates the fibonacci sequence up until a given point
     * 
     * @param upUntil the number it does the sequence up until
     * 
     * @return the sequence in the form of an int array
     */
    private static ArrayList fibCalculator(int upUntil){
        int counter = 0;
        int current = 0;
        ArrayList<Integer> returnable = new ArrayList<Integer>();
        
        while (current < upUntil){
            current = fibonacci(counter);
            returnable.add(current);
            
            counter ++;
        }
        
        return returnable;
    }
    
    /**
     * calculates the number in the fib sequence
     * 
     * @param n the term of the sequence 
     * 
     * @return the nth term in the fib sequence
     */
    public static int fibonacci(int n) {
        if (n == 0){
            return 1;
        }else if (n == 1){
            return 2;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
