package ua.lviv.lgs.VR;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	static void menu() {
		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
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
