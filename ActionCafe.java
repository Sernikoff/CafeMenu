package Cafe;

import java.util.Arrays;

public class ActionCafe {

public Ingredients ingredients;
public Product[] menu;

private Ingredient woter;
private Ingredient teaBlack;
private Ingredient teaGreen;
private Ingredient coffee;
private Ingredient sugar;
private Ingredient milk;
private Ingredient bergamot;
private Ingredient coritsa;

int price;



ActionCafe(){
	generateIngredient();
	generateProducts();
}


private void generateIngredient(){
	
woter = new Ingredient("Woter", 1);
teaBlack = new Ingredient("Black Tea", 2);
teaGreen = new Ingredient("Green Tea", 2);
coffee = new Ingredient("Coffee", 4);
sugar = new Ingredient("Sugar", 1);
milk = new Ingredient("Milk", 2);
bergamot = new Ingredient("Bergamot", 2);
coritsa = new Ingredient("Coritsa", 2);

ingredients = new Ingredients(woter, teaBlack, teaGreen, coffee, sugar, milk, bergamot, coritsa);
}


private void generateProducts(){
Product blackCoffee = new Product("Black Coffee", woter, coffee, sugar);
Product milkCoffee = new Product("Coffee & milk", woter, coffee, sugar, milk);
Product americano = new Product("Americano", woter, coffee, sugar);
Product capuchino = new Product("Capuchino", woter, coffee, sugar, milk, coritsa);
Product mokachino = new Product("Mokachino", woter, coffee, sugar, milk);
Product blackTea = new Product("Black Tea", woter, teaBlack, sugar);
Product greenTea = new Product("Green Tea", woter, teaGreen, sugar);
Product bergamotTea = new Product("Tea & Bergamot", woter, teaBlack, sugar, bergamot);

generateMenu(blackCoffee, milkCoffee, americano, capuchino, mokachino, blackTea, greenTea, bergamotTea);
}


void generateMenu(Product...products){
	menu = products;
}

void printMenu(){
	System.out.println("Name   "+"   Composition   "+"   Price  ");
	for(Product product: menu){
		int total = 0;
		System.out.println();
		System.out.println(product.getName()+"  ");
		for (Ingredient ingredient:product.getIngredients()){
		System.out.print("            "+ingredient.getName()+"          ");
		System.out.println(ingredient.getPrise());
		total+=ingredient.getPrise();
		}
		System.out.println("                  total =  "+ total+"$");
	}
}

void myShmurdyack(String... ingred){
	Ingredient[] ingredin = new Ingredient[10];
	ingredin[0] = woter;
	ingredin[1] = sugar;
	int j = 2;
	for (String ingr: ingred){
		for (Ingredient ing:ingredients.getIngredients())
		if (ingr==ing.getName()){
			ingredin[j] = ing;
			j++;
		}
	}
	
	Product mySmurdyack = new Product("Shmurdyack", ingredin);
	System.out.println(mySmurdyack.getName());
	int total = 0;
	for (Ingredient i: mySmurdyack.getIngredients()){
		if(i==null){break;}
		System.out.println(i.getName()+"   "+i.getPrise());
		total+=i.getPrise();
}
System.out.println("  total = "+total);
}
}
