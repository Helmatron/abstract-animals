package AnimalKingdom;

public class Cane extends AbstractAnimal {
	
	
	@Override
	public void verso() {
		System.out.println("Il Cane abbaia");
	}
	
	@Override
	public void mangia() {
		System.out.println("Si nutre di carne");
	}

	/*
	 * ------------------------------
	 * --------PUBLIC TEST-----------
	 * ------------------------------
	 */
	/*
	public static void main(String[] args) {
		Cane c = new Cane();
		c.dormi();
		c.verso();
		c.mangia();
	}*/
}
