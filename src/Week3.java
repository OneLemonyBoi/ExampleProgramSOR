import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Week3 {
    public static void main(String[] args) {
        // 1D Array
        Integer[] numbers = {3, 4, 7, 245};
        System.out.println(numbers[2]);
        String[] phrases = {"hello", "bye"};
        System.out.println(phrases[0]);

        // 2D Arrays
        Integer[][] numbers2d = {
            {2, 3, 4, 5}, 
            {6, 7, 8, 9}
        };
        Integer[] rowNumbers = numbers2d[0];
        Integer coordinateValue = numbers2d[0][1];
        System.out.println(coordinateValue);

        // Lists
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(3);
        System.out.println(intList.get(0));

        Cat cuteOrangeCat = new Cat("CatA", 3);
        Cat blackCat = new Cat("CatB", 4);
        cuteOrangeCat.talk();
        blackCat.talk();
        blackCat.walk();

        Animal animalWeDontKnow = null;
        Scanner input = new Scanner(System.in);
        System.out.print("Hey! Do you want to have a dog or cat? (D/C)");
        String in = input.nextLine();
        if (in.equals("D")) {
            animalWeDontKnow = new Dog("Doggo", 4);
            animalWeDontKnow.talk();
        }
        else if (in.equals("C")) {
            animalWeDontKnow = new Cat("Cat", 4);
            animalWeDontKnow.talk();
        }

        if (animalWeDontKnow instanceof Walking walker) {
            walker.walk();
        }
    }
}