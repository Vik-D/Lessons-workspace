package ua.lviv.lgs.VR;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	static void menu() {
		System.out.println("������ 1 ��� ������ �������");
		System.out.println("������ 2 ��� �������� ��������� �������");
		System.out.println("������ 3 ��� ������� �� �������");
		System.out.println("������ 4 ��� �������� ��������� �������");
		System.out.println("������ 5 ��� ������� ��������� �������");
		System.out.println("������ 6 ��� ������ �������� � �������");
		System.out.println("������ 7 ��� �������� �������� � �������");
		System.out.println("������ 8 ��� ������� ������ ���������");
		System.out.println("������ 9 ��� ������� ���������� ���������");
		}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		VerkhovnaRada vr = new VerkhovnaRada();
		
		
		while(true) {
			
			menu();
			
			switch (scanner.next()) {
			
			case "1":{
				vr.addFraction();
				break;
			}
			case "2":{
				vr.deleteFraction();
				break;
			}
			case "3":{
				vr.showAllFractions();
				break;
			}
			case "4":{
				
				break;
			}
			case "5":{
				
				break;
			}
			case "6":{
				vr.addDeputatToFraction();
				break;
			}
			case "7":{
				vr.deleteDeputatFromFraction();
				break;
			}
			case "8":{
				vr.showAllFractionBribetakers();
				break;
			}
			case "9":{
				
				break;
				
			}
			
			
			}
			
		
		}
		
	}
   
}
