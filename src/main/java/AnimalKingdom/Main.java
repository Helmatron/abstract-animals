package AnimalKingdom;

public class Main {

	public static void main(String[] args) {

		Cane c = new Cane();
		c.dormi();
		c.verso();
		c.mangia();

		System.out.println("\n");

		Passerotto p = new Passerotto();
		p.dormi();
		p.verso();
		p.mangia();

		System.out.println("\n");

		Aquila a = new Aquila();
		a.dormi();
		a.verso();
		a.mangia();

		System.out.println("\n");

		Delfino d = new Delfino();
		d.dormi();
		d.verso();
		d.mangia();

	}

}
