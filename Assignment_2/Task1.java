class Task1{
  public static void main(String[] args) {
    SinglyLinkedList<Object> myList = new SinglyLinkedList<>();
    myList.addFirst(5);
    myList.addLast(7);
    myList.addLast(4);
    myList.addLast("Hello");
    myList.addLast("World");

    System.out.println("Mixed List: " + myList);
  }
}