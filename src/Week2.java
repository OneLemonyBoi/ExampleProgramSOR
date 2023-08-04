import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {
        Animal randomAnimal = new Animal("`");
        randomAnimal.talk();
        Cat cuteOrangeCat = new Cat("Garfield", 4);
        cuteOrangeCat.talk();
        Cat blackCat = new Cat("BlackCat", 4);
        blackCat.talk();

        randomAnimal.amIAlive();
        cuteOrangeCat.amIAlive();

        Scanner input = new Scanner(System.in);
        System.out.print("Hey! Do you want to print out the number \"5\"? (Y/N)");
        String in = input.nextLine();
        if (in.equals("Y")) {
            System.out.println("5");
        }
        else {

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("*".repeat(i));
            // *
            // **
            // ***
            // ****
        }
    }
}
