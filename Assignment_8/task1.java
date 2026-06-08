package Assignment_8;

class task1{
    public static void main(String[] args) {
        Map<String, Integer> map = new UnsortedTableMap<>();

        map.put("Alice", 25);
        map.put("Bob", 30);
        
        map.put("Eva", 40);
        map.put("Charlie", 35);

        System.out.println("Age of Alice: " + map.get("Alice"));
        System.out.println("Age of Bob: " + map.get("Bob"));
        System.out.println("Age of Charlie: " + map.get("Charlie"));
        System.out.println("Removed Bob's age: " + map.remove("Bob"));
        System.out.println("Is the map empty? " + map.isEmpty());
        System.out.println("Entires in the map: ");

        Iterable<Entry<String, Integer>> array = map.entrySet();
        for(Entry e: array){
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }

        System.out.println("Size of the map: " + map.size());
    }
}