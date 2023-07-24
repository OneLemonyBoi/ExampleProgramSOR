import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Hello World!
        System.out.println("Hello World!");
        // Variables!
        int x = 0;
        double y = 1.5;
        float z = 2.5f;
        String str = "Hello SOR!";
        // Printing Variables
        System.out.println(str);
        // System I/O
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        System.out.println(in);
        // Functions
        print(str);
        System.out.println(add(3, 4));
        System.out.println(subtract(3, 4));
    }

    // Function to print
    public static void print(String str) {
        System.out.println(str);
    }
    // Function to add numbers
    public static int add(int a, int b) {
        return a + b;
    }
    // Function to subtract numbers
    public static int subtract(int a, int b) {
        return a - b;
    }
}
