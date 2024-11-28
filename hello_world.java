// HelloWorld.java
public class hello_world {
    public static void main(String[] args) {
       if (args.length > 0) {
            String secretKey = args[0];  // First argument is the secret key
            System.out.println("The secret key is: " + secretKey);  // This will print the secret key in the console
        } else {
            System.out.println("No secret key provided.");
        }
    }
}
