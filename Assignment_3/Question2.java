
import java.util.Random;

class Question2{
    public static void main(String[] args) {
        int n = 10;
        int[] A = new int[n-1];
        int rand = new Random().nextInt(n);
        for(int x = 0; x < n-1; x++){
            if (x < rand){
                A[x] = x;
            }else{
                A[x] = x+1;
            }
        }

        System.out.print("Array A >>> ");
        for(int x = 0; x < A.length; x++){
            System.out.print(A[x]);
            if (A.length - x > 1){
                System.out.print(", ");
            }
        }
        System.out.println(" (missing number " + rand + ")");

        System.out.println("Algorithm detects number " + find_Missing_Number(A) + " is missing.");
    }

    public static int find_Missing_Number(int[] A){
        int array_Sum = 0;
        int natural_Sum = 0;
        for(int x = 0; x < A.length; x++){
            natural_Sum += x+1;
            array_Sum += A[x];
        }
        return natural_Sum - array_Sum;
    }
}