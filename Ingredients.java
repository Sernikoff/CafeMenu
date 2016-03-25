package Cafe;

public class Ingredients {
	
	private Ingredient [] ingredients;
	
	Ingredients(Ingredient... ingredients){
		this.ingredients = ingredients;
	}

	public Ingredient[] getIngredients() {
		return ingredients;
	}

	public void setIngredients(Ingredient[] ingredients) {
		this.ingredients = ingredients;
	}
	
	public void addIngredient(Ingredient ingredient){
		ingredients = new Ingredient[ingredients.length+1];
		ingredients[ingredients.length-1] = ingredient;
	}
	
	

}
