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
    public static void main(String args[]){

        System.out.println(primeSum(2000000));
        
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
    
    /**
     * returns the largest sum of 13 adjacent numbers in the 1000 digit number
     * 
     * @return the largest sum of 13 adjacent numbers in the 1000 digit number
     */
    public static long adj13(){
        ArrayList<Integer> all = new ArrayList<Integer>();
        String bigBoi = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        long biggestBoi = 0;
        
        for (int i = 0; i < bigBoi.length(); i++){
            all.add(Integer.parseInt(bigBoi.substring(i, i+1)));
        }
        
        
        for (int i = 12; i < bigBoi.length(); i++){
            long currentBigBoi= 1;
            
            for (int j = 12; j >= 0; j--){
                currentBigBoi *= all.get(i-j);
            }
            
            if (currentBigBoi > biggestBoi){
                biggestBoi = currentBigBoi;
            }
        }
        
        return biggestBoi;
    }
    
    /**
     * A function that detrmines if a number is prime
     * 
     * @param n     number to test
     * @return      true if number is prime, false otherwise
     */
    public static boolean isPrime(int n)
    {
        if (n == 2)        return true;
        else if (n % 2==0 || n<2) return false;
        
        double limit = Math.sqrt(n);
        
        for (int i=3; i<=limit; i+=2)
        {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
    /**
     * returns the sum of all the prime numbers to a given end
     * 
     * @param end the point at which the the user want it to stop counting the primes 
     * 
     * @return the sum of all the prime numbers to a given end
     */
    public static long primeSum(int end){
        long sum =0;
        for (int i =2; i<=end; i++){
            if (isPrime(i)){
                sum += i;
            }
        }
        
        return(sum);
    }
}
