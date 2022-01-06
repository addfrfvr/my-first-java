package javaBase;

class Clothes2 {
	String color;
	char size;
	String brand;

	Clothes2(String color, char size,String brand) {
		this.color = color;
		this.size = size;
		this.brand =brand;
	}

}

public class Field2 {
	public static void main(String[] args) {
		Clothes2 sun = new Clothes2("red",'S',"koko");
		Clothes2 spring = new Clothes2("green",'M',"koko");
		
		System.out.printf("sun (%s ,%c, %s)%n", sun.color, sun.size,sun.brand);
		System.out.printf("spring(%s, %c ,%s)%n", spring.color, spring.size,spring.brand);

	}
}
