
public abstract class Angajat {
	String nume;
	int varsta;
	int aniExp;
	int tarifPerOra;
	int nrOreLucrate;
	int nivel;
	
	
	public Angajat(String nume, int varsta, int aniExp, int tarif, int nrOreLucrate, int nivel) {
		this.nume = nume;
		this.varsta = varsta;
		this.aniExp = aniExp;
		this.tarifPerOra = tarif;
		this.nrOreLucrate = nrOreLucrate;
		this.nivel = nivel;
	}
	
	public Angajat() {
		this("Necunoscut", -1, -1, 0, -1, 0);
	}
	
	public abstract int calcSalar();

	public String getNume() {
		return nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public int getAniExp() {
		return aniExp;
	}

	public int getTarifPerOra() {
		return tarifPerOra;
	}

	public int getNrOreLucrate() {
		return nrOreLucrate;
	}

	public int getNivel() {
		return nivel;
	}
	
}
