package Problem1;


/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food
{
    // instance variables - replace the example below with your own
protected String name;

    public Food(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Eating " + name);
    }
}

