
public class TeamLeader extends Angajat{
	private int bonusNivel;
	
	public TeamLeader(String nume, int varsta, int aniExp, int tarif, int nrOreLucrate, int nivel) {
		super(nume, varsta, aniExp, tarif, nrOreLucrate, nivel);
		if (nivel == 1)
			bonusNivel = 200;
		else
			bonusNivel = 300;
	}
	
	@Override
	public int calcSalar() {
		return tarifPerOra * nrOreLucrate + bonusNivel;
	}
	
	public String toString() {
		return "Angajatul " + nume + " are varsta " + varsta + ", " + aniExp + " ani experienta, " + tarifPerOra + " tariful per ora, " + nrOreLucrate + " ore lucrate si are nivelul " + nivel;
	}
}
