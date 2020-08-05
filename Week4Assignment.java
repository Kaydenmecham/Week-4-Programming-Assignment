// Kayden Mecham Csis 1400 Summer 2020 
import java.util.Scanner;
public class Week4Assignment {
	
	public static void main(String[] args) {
Scanner Values = new Scanner(System.in);
		
		int length, width, height;
		System.out.println("This program will calculate the surface area and volume of a box from dimensions the user enters\n");
		
		System.out.println("What is the lenght of the box?");
		length = Values.nextInt();
		System.out.println("What is the width of the box?");
		width = Values.nextInt();
		System.out.println("What is the height of the box?");
		height = Values.nextInt();
		
		boxArea(length,width,height);
		System.out.printf("The surface area of your box is: %d%n", boxArea(length,width,height));
		boxVol(length,width,height);
		System.out.printf("The volume of your box is: %d%n", boxVol(length,width,height));
	}

	private static int boxVol(int length, int width, int height) {
		return (length * width * height);
		
	}

	private static int boxArea(int length, int width, int height) {
		return (2*length*width + 2*length*height + 2* height*width);
		
	}

}
