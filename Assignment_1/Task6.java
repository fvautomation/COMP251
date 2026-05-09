// Task6

class Pair<K, V> { // Pair Class
    
    // Variables
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }
 }

 // Main Class

 public class Task6 {

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        Pair<String, Double> pair2 = new Pair<>("Price", 19.99);
        Pair<Integer, String> pair3 = new Pair<>(1, "One");

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);

        pair1.setKey("Updated Age");
        pair1.setValue(30);

        System.out.println(pair1);
    }
 }