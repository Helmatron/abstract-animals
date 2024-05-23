package AnimalKingdom;

public class Passerotto extends AbstractAnimal implements IVolante{

	@Override
	public void verso() {
		System.out.println("Il Passerotto cinguetta");
	}
	
	@Override
	public void mangia() {
		System.out.println("Si nutre di vermi");
	}
	
	public void vola() {
		System.out.println("Sto volando!!!");
	}

	@Override
	public void faiVolare() {
		System.out.println("Sto Volando!");
	}
	
}
