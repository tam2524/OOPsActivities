package Problem1;


public class Burger extends Food {
    public Burger(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Devouring a delicious burger");
    }
}