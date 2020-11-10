
public class Echipa {
	private String nume;
	private TeamLeader teamLeader;
	private Developer []developeri;
	private int nrDeveloperi;
	
	public Echipa ( String nume, TeamLeader teamLeader, int nrDeveloperi) {
		this.nume = nume;
		this.teamLeader = teamLeader;
		this.nrDeveloperi = 0;
		developeri = new Developer[nrDeveloperi];
	}
	
	public void adaugaDeveloper(Developer dev) {
		developeri[nrDeveloperi++] = dev;
	}
	
	public void afisEchipa() {
		System.out.println("Echipa " + nume + " este condusa de " + teamLeader.getNume() + " si are in subordine urmatorii developeri:");
		for ( Developer d : developeri) {
			if ( d != null ) {
				System.out.println(d.getNume());
			}
		}
		System.out.println();
	}
	
	public String getAngajati() {
		String aux = "";
		aux = aux + teamLeader.getNume() + ", ";
		for ( Developer d : developeri) {
			if ( d != null ) {
				aux = aux + d.getNume() + ", ";
			}
		}
		return aux;
	}
	
	public void schimbareTeamLeader(TeamLeader lider) {
		teamLeader = lider;
	}
	
	public void afisTeamLeader() {
		System.out.println("Team leader-ul echipei " + nume + " este " + teamLeader.getNume());
		System.out.println();
	}
}
