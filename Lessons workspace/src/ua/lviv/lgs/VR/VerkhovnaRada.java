package ua.lviv.lgs.VR;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VerkhovnaRada {


	ArrayList<Fraction> v_rada = new ArrayList<Fraction>();

	public void addFraction() {
		System.out.println("������ ����� �������: ");
		Scanner sc = new Scanner(System.in);
		String fractionName = sc.next();
		Fraction fraction = new Fraction(fractionName, null);
		v_rada.add(fraction);
		System.out.println("������� " + fractionName + " ������");
	}

	public void deleteFraction() {
		System.out.println("������ ����� �������: ");
		Scanner sc = new Scanner(System.in);
		String fractionName = sc.next();
		Iterator<Fraction> iterator = v_rada.iterator();
		while (iterator.hasNext()) {
			Fraction next = iterator.next();
			if (next.getFractionName().equalsIgnoreCase(fractionName)) {
				v_rada.remove(next);
				System.out.println("������� " + next + " ��������");
			}
		}
	}

	public void showAllFractions() {
		System.out.println("------------ ������ ��� ������� ------------");
		for (Fraction fraction : v_rada) {
			System.out.println(fraction.getFractionName());
		}
		System.out.println();
	}

//	public void showFractionByName() {
//		System.out.println("������ ����� �������: ");
//		Scanner sc = new Scanner(System.in);
//		String fractionName = sc.next();
//		
//	}

	public void addDeputatToFraction() {
		System.out.println("������ ����� �������: ");
		Scanner sc = new Scanner(System.in);
		String fractionCheckName = sc.next();
		for (Fraction fraction : v_rada) {
			if (fraction.getFractionName().equalsIgnoreCase(fractionCheckName)) {
				fraction.addDeputat();
			} else {
				System.out.println("���� ������� �� ��������, �������� ����������� �������� �����.");
			}
		}
	}

	public void deleteDeputatFromFraction() {
		System.out.println("������ ����� �������: ");
		Scanner sc = new Scanner(System.in);
		String fractionCheckName = sc.next();
		for (Fraction fraction : v_rada) {
			if (fraction.getFractionName().equalsIgnoreCase(fractionCheckName)) {
				fraction.removeDeputat();
			} else {
				System.out.println("���� ������� �� ��������, �������� ����������� �������� �����.");
			}
		}
	}

	public void showAllFractionBribetakers() {
		System.out.println("������ ����� �������: ");
		Scanner sc = new Scanner(System.in);
		String fractionCheckName = sc.next();
		for (Fraction fraction : v_rada) {
			if (fraction.getFractionName().equalsIgnoreCase(fractionCheckName)) {
				fraction.showAllBribetakers();
			} else {
				System.out.println("���� ������� �� ��������, �������� ����������� �������� �����.");
			}
		}
	}

	public void showBiggestFractionBribetaker() {
		System.out.println("������ ����� �������: ");
		Scanner sc = new Scanner(System.in);
		String fractionCheckName = sc.next();
		for (Fraction fraction : v_rada) {
			if (fraction.getFractionName().equalsIgnoreCase(fractionCheckName)) {
				fraction.showBiggestBribetaker();
			} else {
				System.out.println("���� ������� �� ��������, �������� ����������� �������� �����.");
			}
		}
	}
	
	public void showAllSpecifiedFractionDeputates() {
		System.out.println("������ ����� �������: ");
		Scanner sc = new Scanner(System.in);
		String fractionCheckName = sc.next();
		for (Fraction fraction : v_rada) {
			if (fraction.getFractionName().equalsIgnoreCase(fractionCheckName)) {
				fraction.showAllFractionDeputates();
			} else {
				System.out.println("���� ������� �� ��������, �������� ����������� �������� �����.");
			}
		}
	}
	
	
	
}
