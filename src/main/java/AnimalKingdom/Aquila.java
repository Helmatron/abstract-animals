package AnimalKingdom;

public class Aquila extends AbstractAnimal implements IVolante {
	


	@Override
	public void verso() {
		System.out.println("L'aquila stridisce");
	}
	
	@Override
	public void mangia() {
		System.out.println("Si nutre di carne");
	}

	@Override
	public void faiVolare() {
		System.out.println("Sto Volando!");
	}
	
	
}
