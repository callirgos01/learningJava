public class HelloPrinter {
    public static void main(String[] args) {
        try {
            System.out.format("Hello, World! %s\r\n", args[0]);
        }
        catch(Exception e) {
            System.out.format("Hello, World! %s", e.getMessage());
        }
        
    }
}
