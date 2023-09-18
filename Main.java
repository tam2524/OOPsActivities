package Problem1;



public class Main
{
    	public static void main(String[] args) {
		
		        Food pizza = new Pizza("Ham and Cheese Pizza");
		        Food fries = new FrenchFries("Sour Cream French Fries");
		        Food burger = new Burger("Cheesy Bacon Burger");

		        pizza.eat();
		        fries.eat();
		        burger.eat();
		    }
		}