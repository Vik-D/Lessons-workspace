package ua.lviv.lgs.VR;

import java.util.Scanner;

public class Deputat extends Human {

	public String surname;
	public String name;
	public int age;
	private boolean bribeTaker;
	private int bribeSize;

	public Deputat(int weight, int age, String surname, String name, int age2, boolean bribeTaker) {
		super(weight, age);
		this.surname = surname;
		this.name = name;
		age = age2;
		this.bribeTaker = bribeTaker;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	public int getBribeSize() {
		return bribeSize;
	}

	public void setBribeSize(int bribeSize) {
		this.bribeSize = bribeSize;
	}

	@Override
	public String toString() {
		return "Deputat [surname=" + surname + ", name=" + name + ", age=" + age + ", bribeTaker=" + bribeTaker
				+ ", bribeSize=" + bribeSize + "]";
	}

	/**
	 * 
	 */
	public void giveBribe() {

		if (bribeTaker == false) {
			System.out.println("Цей депутат не бере хабарів");
		} else {
			Scanner sc = new Scanner(System.in);
			int bribeInput = sc.nextInt();
			System.out.println("Ведіть суму хабаря:");
			if (bribeInput > 5000) {
				System.out.println("Поліція ув`язнить депутата");
			} else if (bribeInput < 5000 && bribeInput > 0) {
				bribeInput = getBribeSize();
			} else if (bribeInput <= 0) {
				System.out.println("ТЮ! Ви чи жартуєте, чи шо?!!");// від себе жарт, в завданні нема такого ))))
			}
		}
	}

}
