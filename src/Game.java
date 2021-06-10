import java.util.Random;
import java.util.Scanner;

public class Game {
	
	

	public static void main(String[] args) {
		Random r = new Random();
		int nbrEssai = 0;
		int justePrix = r.nextInt(200);
		int prix = 0;
		
		while(justePrix != prix) {
			
			System.out.println("Entrez un numéro entre 0 et 200");
			Scanner scan = new Scanner(System.in);
			
			prix = scan.nextInt();
			
			if (justePrix > prix) {
				System.out.println("C'est plus !");
			} else {
				System.out.println("C'est moins !");
			}
			
			nbrEssai++;
		};
		
		System.out.println("Bravo ! le justePrix est : "+justePrix+"\n");
		System.out.println("nombre d'essai : "+nbrEssai);

	}

}
