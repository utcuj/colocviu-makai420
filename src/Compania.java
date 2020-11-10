
public class Compania {
	private int nrAngajati;
	private Angajat []angajati = new Angajat[100];
	
	public Compania() {
		nrAngajati = 0;
	}
	
	public void adaugaAngajat(Angajat a) {
		angajati[nrAngajati++] = a;
	}
	
	public void stergeUltimulAngajat() {
		angajati[nrAngajati-1] = null;
		nrAngajati--;
	}
	
	public void afisAnagajati() {
		for (Angajat a : angajati ) {
			if ( a != null ) {
				System.out.println(a.toString());
			}
		}
		System.out.println();
	}

	public int getNrAngajati() {
		return nrAngajati;
	}
	
}
