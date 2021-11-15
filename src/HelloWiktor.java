import presentation.MessagePrinter;

public class HelloWiktor {
    public static void main(String[] args) {
        MessagePrinter messagePrinter = new MessagePrinter(); //creating instance of the class
        messagePrinter.sayHello(); //nothig will be displayed, because method is only returning something
        System.out.println(messagePrinter.sayHello()); //will display the message in the console
//        System.out.println("Hello Wiktor");
    }
}
