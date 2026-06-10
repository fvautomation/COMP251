package Assignment_8;

class task2{
    public static void main(String[] args) {
        ChainHashMap<String, Integer> table = new ChainHashMap<>();

        table.put("Alice", 25);
        table.put("Bob", 30);
        
        table.put("Eva", 40);
        table.put("Charlie", 35);

        System.out.println("Age of Alice: " + table.get("Alice"));
        System.out.println("Age of Bob: " + table.get("Bob"));
        System.out.println("Age of Charlie: " + table.get("Charlie"));
        System.out.println("Removed Bob's age: " + table.remove("Bob"));
        System.out.println("Is the table empty? " + table.isEmpty());
        System.out.println("Entires in the table: ");

        Iterable<Entry<String, Integer>> array = table.entrySet();
        for(Entry e: array){
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }

        System.out.println("Size of the table: " + table.size());
    }
}