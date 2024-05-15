package AnimalKingdom;

public class Passerotto extends AbstractAnimal{

	@Override
	public void verso() {
		System.out.println("Il Passerotto cinguetta");
	}
	
	@Override
	public void mangia() {
		System.out.println("Si nutre di vermi");
	}
	
}
