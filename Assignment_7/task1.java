package Assignment_7;

class task1{
    public static void main(String[] args) {
        UnsortedPriorityQueue<Integer, String> priorityQueue = new UnsortedPriorityQueue<>();
        priorityQueue.insert(5, "A");   
        priorityQueue.insert(9, "C");
        priorityQueue.insert(3, "B");

        System.out.println("Minimum Key: " + priorityQueue.min().getKey() + ", Value: " + priorityQueue.min().getValue());
        
        while(priorityQueue.size() > 0){
            Entry nextItem = priorityQueue.removeMin();
            System.out.println("Key: " + nextItem.getKey() + ", Value: " + nextItem.getValue());
        }
    }
}