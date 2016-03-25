package Cafe;

public class Ingredient {
	private String name;
	private int prise;


	public	Ingredient(String name, int prise){
			this.name = name;
			this.prise = prise;
		}


	public String getName() {
		return name;
	}

	public int getPrise() {
		return prise;
	}


	public void setPrise(int prise) {
		this.prise = prise;
	}

}
