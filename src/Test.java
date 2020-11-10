import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int nrAngajati = console.nextInt();
		System.out.println("Compania are " + nrAngajati + " angajati");
		Compania firma = new Compania();
		
		TeamLeader gelu = new TeamLeader("Gelu", 35, 10, 20, 300, 2);
		TeamLeader mihai = new TeamLeader("Mihai", 29, 5, 10, 200, 1);
		
		Manager vlad = new Manager("Vlad", 40, 15, 35, 250, 1);
		
		Developer radu = new Developer("Radu", 32, 8, 15, 150, 1, "problema salariilor");
		Developer denis = new Developer("Denis", 37, 12, 17, 180, 2, "problema cu serverele");
		Developer geani = new Developer("Geani", 28, 4, 7, 420, 1, "problema de backend");
		Developer mirela = new Developer("Mirela", 34, 9, 16, 220, 2, "problema cu laptopul lui Gelu");
		
		System.out.println(radu.rezTask());
		System.out.println(geani.rezTask());
		
		vlad.adaugaAngajat(gelu, firma);
		vlad.adaugaAngajat(mihai, firma);
		vlad.adaugaAngajat(radu, firma);
		vlad.adaugaAngajat(denis, firma);
		vlad.adaugaAngajat(geani, firma);
		vlad.adaugaAngajat(mirela, firma);
		firma.afisAnagajati();
		
		vlad.stergeAngajat(firma);
		
		firma.afisAnagajati();
		
		Echipa ecoTeam = vlad.creareEchipa("Eco Team", gelu, 3);
		vlad.adaugaInEchipa(ecoTeam, radu);
		vlad.adaugaInEchipa(ecoTeam, geani);
		vlad.adaugaInEchipa(ecoTeam, mirela);
		ecoTeam.afisEchipa();
		
		Echipa rescue = vlad.creareEchipa("Rescue", mihai, 2);
		vlad.adaugaInEchipa(rescue, denis);
		vlad.adaugaInEchipa(rescue, mirela);
		rescue.afisEchipa();
		
		System.out.println("Salariul lui " + geani.getNume() + " este " + geani.calcSalar());
		System.out.println("Salariul lui " + vlad.getNume() + " este " + vlad.calcSalar());
		System.out.println("Salariul lui " + gelu.getNume() + " este " + gelu.calcSalar());
		System.out.println();
		
		ecoTeam.afisTeamLeader();
		vlad.modificaTeamLeader(ecoTeam, mihai);
		ecoTeam.afisTeamLeader();
		
		Proiect proiect1 = new Proiect(vlad, 2);
		proiect1.adaugareEchipe(ecoTeam);
		proiect1.afisProiect();
		proiect1.adaugareEchipe(rescue);
		proiect1.afisProiect();
		
	}

}
