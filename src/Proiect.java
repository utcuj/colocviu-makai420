
public class Proiect {
	private Manager managerProiect;
	private int nrEchipe;
	private Echipa []echipe;
	
	
	public Proiect(Manager manager, int nrEchipe) {
		this.managerProiect = manager;
		echipe = new Echipa[nrEchipe];
		this.nrEchipe = 0;
	}
	
	public void adaugareEchipe(Echipa echipa) {
		echipe[nrEchipe++] = echipa;
	}
	
	public void afisProiect() {
		System.out.print("Angajatii care lucreaza proiect sunt " + managerProiect.getNume() + ", ");
		for ( Echipa e : echipe ) {
			if ( e != null ) {
				System.out.println(e.getAngajati());
			}
		}
		System.out.println();
	}
}
