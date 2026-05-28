
import java.util.Scanner;

public class task2{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for(int x = 18; x >= 2; x--){
            list.add(0, x);
        }

        System.out.println("Contents of the List:\n" + list);
        System.out.println("Enter an integer that you want to find in the list: ");

        try{
            int toFind = scan.nextInt();

            if(list.contains(toFind)){
                System.out.println("Yes, the element of value " + toFind + " is included in the list.");
            }else{
                System.out.println("No, the element of value " + toFind + " is NOT included in the list.");
            }
        }catch (java.util.InputMismatchException e){
            System.out.println("Please enter a valid integer.");
        }

    }
}