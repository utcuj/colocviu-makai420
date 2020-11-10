
public class Manager extends Angajat{
	private int bonusNivel;
	
	
	public Manager(String nume, int varsta, int aniExp, int tarif, int nrOreLucrate, int nivel) {
		super(nume, varsta, aniExp, tarif, nrOreLucrate, nivel);
		if (nivel == 1)
			bonusNivel = 300;
		else
			bonusNivel = 400;
	}
	
	public void adaugaAngajat(Angajat angajat, Compania a) {
		a.adaugaAngajat(angajat);
	}
	
	public void stergeAngajat(Compania a) {
		a.stergeUltimulAngajat();
	}
	
	@Override
	public int calcSalar() {
		return tarifPerOra * nrOreLucrate + bonusNivel;
	}
	
	public Echipa creareEchipa(String nume, TeamLeader teamLeader, int nrDeveloperi) {
		Echipa e = new Echipa(nume, teamLeader, nrDeveloperi);
		return e;
	}
	
	public void adaugaInEchipa(Echipa e, Developer dev) {
		e.adaugaDeveloper(dev);
	}
	
	public void modificaTeamLeader(Echipa e, TeamLeader lider) {
		e.schimbareTeamLeader(lider);
	}
	
	public String toString() {
		return "Angajatul " + nume + " are varsta " + varsta + ", " + aniExp + " ani experienta " + tarifPerOra + " tariful per ora " + nrOreLucrate + " ore lucrate si are nivelul " + nivel;
	}
}
