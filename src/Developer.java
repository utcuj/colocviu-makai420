
public class Developer extends Angajat{
	private int bonusNivel;
	private String task;
	
	
	public Developer(String nume, int varsta, int aniExp, int tarif, int nrOreLucrate, int nivel, String task) {
		super(nume, varsta, aniExp, tarif, nrOreLucrate, nivel);
		if (nivel == 1)
			bonusNivel = 100;
		else
			bonusNivel = 200;
		this.task = task;
	}
	
	@Override
	public int calcSalar() {
		return tarifPerOra * nrOreLucrate + bonusNivel;
	}
	
	public String toString() {
		return "Angajatul " + nume + " are varsta " + varsta + ", " + aniExp + " ani experienta, " + tarifPerOra + " tariful per ora, " + nrOreLucrate + " ore lucrate si are nivelul " + nivel;
	}
	
	public String rezTask() {
		return nume + " rezolva " + task + ".";
	}
	
}
