public abstract class Walking extends Animal {
    public int legs;

    public Walking(String name, int legs) {
        super(name);
        this.legs = legs;
    }

    public abstract void walk();
}
