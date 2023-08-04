public class Cat extends Walking {
    public Cat(String name, int legs) {
        super(name, legs);
    }

    @Override
    public void talk() {
        System.out.println("Meow!");
    }

    @Override
    public void walk() {
        System.out.println("I am a cat who is walking!");
    }
}
