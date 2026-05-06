public class Task3{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;
        String s3 = new String("Hello");

        System.out.println(s1 == s2);       //true because the compiler sees them as the same object
        System.out.println(s1 == s3);       //false because they are different objects due to the "new String"
        System.out.println(s1.equals(s3));  //true because the value of the objects is the same
    }
}