


/**
 * This class produces a long string (of size 'n') of asterisks.The algorithm is based on string concatenation
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Asterick
{
    public static void main (String [] args){
        int n=500000;  // size of input which is five hundred thousand
        char c ='*';
        long startTime = System.currentTimeMillis( ); // record the starting time
        // Here is the algorithm
        String answer = "";
        for (int j=0; j < n; j++)
        answer += c;
        long endTime = System.currentTimeMillis( ); // record the ending time
        long elapsed = endTime - startTime; // compute elapsed time
        
        System.out.println("The running time is "+ elapsed/1000.0 + " secs"); 
    }
}
