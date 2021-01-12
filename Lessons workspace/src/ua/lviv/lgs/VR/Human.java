package ua.lviv.lgs.VR;

public class Human {

	private int weight;
	private int age;

	public Human(int weight, int age) {
		super();
		this.weight = weight;
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [weight=" + weight + ", age=" + age + "]";
	}

}
