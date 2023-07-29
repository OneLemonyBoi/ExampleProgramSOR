import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {
        // Hello World!
        System.out.println("hello world!");
        // Variables!
        int variable1 = 5;
        float var2 = 5.67f;
        double var3 = 3.72;
        String str = "Hello SOR!";
        // Printing Variables
        System.out.println(str);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(variable1);
        // System I/O
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(input);
        // Functions
        print(str);
        System.out.println(addNumber(1, 2));
    }

    // Function to print

    static void print(String input) {
        System.out.println(input);
    }

    // Function to add numbers

    static int addNumber(int a, int b) {
        return a+b;
    }

    // Function to subtract numbers
}
