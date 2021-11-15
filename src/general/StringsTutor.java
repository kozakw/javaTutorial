package general;

public class StringsTutor {
    public static void main(String[] args) {
        String s1 = "hello world"; //this syntax creates the String object in the String pool
        String s2 = "hello world"; //re-using the same object created above
        System.out.println("Address of the object s1: " + System.identityHashCode(s1));
        System.out.println("Address of the object s2: " + System.identityHashCode(s2));

        String s3 = new String("hello world"); // creating new object outside String pool
        System.out.println("Address of the object s3: " + System.identityHashCode(s3));

        System.out.println(s1 == s2); //true - since they are pointing to the same object in memory
        System.out.println(s1.equals(s2)); //true the content of the string is the same

        System.out.println(s1 == s3); //false - since they are in different memory locations
        System.out.println(s1.equals(s3)); //true - the CONTENT of the objects IS THE SAME

        s3 = "new string vale";
        System.out.println(s1.equals(s3)); //false - since I have different content for s1 and s3
    }
}
