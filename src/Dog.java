public class Dog extends Walking {
    public Dog(String name, int legs) {
        super(name, legs);
    }

    @Override
    public void talk() {
        System.out.println("Woof!");
    }

    @Override
    public void walk() {
        System.out.println("I am a dog who is walking!");
    }
}
