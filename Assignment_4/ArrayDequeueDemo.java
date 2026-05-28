import java.util.ArrayDeque;

public class ArrayDequeueDemo{
    public static void main(String[] args) {
        ArrayDeque<Pair> a = new ArrayDeque<>();

        Pair<String, Integer> P1 = new Pair<>("Books", 4);
        Pair<String, Integer> P2 = new Pair<>("Mobiles", 3);
        Pair<String, Integer> P3 = new Pair<>("Laptops", 2);
        Pair<String, Integer> P4 = new Pair<>("Boards", 5);

        a.add(P1);
        a.addFirst(P2);
        a.addFirst(P3);
        a.addLast(P4);

        System.out.println("Then contents of Deque are: " + a);
        //The contents of Deque are: [(Laptops,2), (Mobiles,3), (Books,4), (Boards,5)]
    }
}

class Pair<A,B> {
  A first;
  B second;
 public Pair(A a, B b) { // constructor
 first = a;
 second = b;
 } 
 public A getFirst( ) { return first; }
 public B getSecond( ) { return second;}
 
  @Override
 public String toString(){
     return "("+ getFirst() + "," + getSecond() +")";
 }
}