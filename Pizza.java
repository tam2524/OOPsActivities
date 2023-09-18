package Problem1;


public class Pizza extends Food{
	
	public Pizza(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Enjoying a slice of pizza");
    }


}
