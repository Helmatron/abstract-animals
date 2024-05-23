package AnimalKingdom;

public class Main {

	public static void main(String[] args) {
		
		

		Cane c = new Cane();
		c.dormi();
		c.verso();
		c.mangia();

		System.out.println("");

		Passerotto p = new Passerotto();
		p.dormi();
		p.verso();
		p.mangia();
		p.faiVolare();

		System.out.println("");

		Aquila a = new Aquila();
		a.dormi();
		a.verso();
		a.mangia();
		a.faiVolare();
		

		System.out.println("");

		Delfino d = new Delfino();
		d.dormi();
		d.verso();
		d.mangia();
		d.faiNuotare();

	}

	


}
