package find_santa;

import java.util.Scanner;

public class SantaFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		SantaSuspects santaSuspects = new SantaSuspects(20);
		santaSuspects.addSuspect("Bob Beazanga");
		santaSuspects.addSuspect("Sally Zimmers");
		santaSuspects.addSuspect("Peter Pinkleton");
		santaSuspects.addSuspect("Bobby Drop Tables");
		santaSuspects.addSuspect("Rudolph Rednose");
		santaSuspects.addSuspect("Bob Ross");
		santaSuspects.addSuspect("Ubiga Altman");
		santaSuspects.addSuspect("Tony Ross");
		santaSuspects.addSuspect("Aaron Ross");
		santaSuspects.addSuspect("Yolo Once");
		santaSuspects.addSuspect("Yoka Yamalla");
		santaSuspects.addSuspect("Big Show");
		santaSuspects.addSuspect("Doug Dimmadome");
		
		System.out.println("Enter a name to search for: ");
		String searchFor = scanner.nextLine();
		
		boolean foundMatch = santaSuspects.foundMatch(searchFor);
		if(foundMatch)
				System.out.println(searchFor + " is indeed a santa suspect");
		else
				System.out.println(searchFor + " is not a santa suspect");
		scanner.close();

	}
}
