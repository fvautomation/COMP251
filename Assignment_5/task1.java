public class task1{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int x = 50; x >= 10; x-=10){
            list.add(0, x);
        }

        System.out.println("Contents of the ArrayList:\n" + list);
    }
}