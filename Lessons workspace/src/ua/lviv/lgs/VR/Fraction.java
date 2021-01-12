package ua.lviv.lgs.VR;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Fraction {

	String fractionName;
	ArrayList<Deputat> fraction = new ArrayList<Deputat>();

	public Fraction(String fractionName, ArrayList<Deputat> fraction) {
		super();
		this.fractionName = fractionName;
		this.fraction = fraction;
	}

	public String getFractionName() {
		return fractionName;
	}

	public void setFractionName(String fractionName) {
		this.fractionName = fractionName;
	}

	@Override
	public String toString() {
		return "Fraction [fractionName=" + fractionName + "]";
	}

	public void addDeputat() {
		System.out.println("¬вед≥ть ≥м'€ депутата: ");
		Scanner sc1 = new Scanner(System.in);
		String deputatName = sc1.next();
		System.out.println("¬вед≥ть пр≥звище депутата: ");
		Scanner sc2 = new Scanner(System.in);
		String deputatSurname = sc2.next();
		System.out.println("¬вед≥ть в≥к депутата: ");
		Scanner sc3 = new Scanner(System.in);
		int deputatAge = sc3.nextInt();
		Deputat deputat = new Deputat(0, 0, deputatSurname, deputatName, deputatAge, false);
		fraction.add(deputat);
		System.out.println("ƒепутата" + deputatSurname + "додано.");
	}

	public void removeDeputat() {
		System.out.println("¬вед≥ть пр≥звище депутата: ");
		Scanner sc = new Scanner(System.in);
		String deputatSurname = sc.next();
		Iterator<Deputat> iterator = fraction.iterator();
		while (iterator.hasNext()) {
			Deputat next = iterator.next();
			if (next.getSurname().equalsIgnoreCase(deputatSurname)) {
				iterator.remove();
			}
		}
	}

	public void showAllBribetakers() {
		Iterator<Deputat> iterator = fraction.iterator();
		while (iterator.hasNext()) {
			Deputat next = iterator.next();
			if (next.isBribeTaker() == true) {
				System.out.println(next);
			}
		}
	}

	public void showBiggestBribetaker() {
		Iterator<Deputat> iterator = fraction.iterator();
		int check = 0;
		String biggestBribetaker = null;
		while (iterator.hasNext()) {
			Deputat next = iterator.next();
			if (next.getBribeSize() > check) {
				check = next.getBribeSize();
				biggestBribetaker = next.getSurname();
			}
		}
		System.out.println(biggestBribetaker);
	}

	public void showAllFractionDeputates() {
		for (Deputat deputat : fraction) {
			System.out.println(deputat);
		}
	}

	public void clearWholeFraction() {
		fraction.clear();
	}

}
