package AnimalKingdom;

public class Delfino extends AbstractAnimal implements INuotante{
	
	@Override
	public void verso() {
		System.out.println("Il Delfino frigge (lol)");
	}
	
	@Override
	public void mangia() {
		System.out.println("Si nutre di pesci");
	}
	
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}

	@Override
	public void faiNuotare() {
		System.out.println("Sto Nuotando!");
		
	}

}
