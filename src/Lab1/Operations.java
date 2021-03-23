package Lab1;
import java.util.Scanner;
public class Operations {
	
	Scanner sc = new Scanner(System.in);
	
	int firstNumber;
	int secondNumber;
	public void read() {
		try
		{
		System.out.println("First number : ");
		firstNumber = sc.nextInt();
		System.out.println("Second number : ");
		secondNumber = sc.nextInt();	
		}catch(Exception e) {
			System.err.println("Just numbers please :) , try again!");
			sc.nextLine();
			read();
		}
		
		sc.close();
	}
	
	public void sum() {
		int sum = firstNumber+secondNumber;
		System.out.println("Sum of numbers is : " + sum);
	}
	
	public void difference() {
		int diff = firstNumber - secondNumber;
		System.out.println("Difference on numbers is : " + diff);
		
	}
	
	public void product() {
		int prod = firstNumber * secondNumber;
		System.out.println("Product of numbers is : " + prod);
	}
	
	public void average() {
		double avg = (firstNumber + secondNumber)/2.0;
		System.out.println("Average is : " + avg);
	}
	
	public void distance() {
		int dist = firstNumber - secondNumber;
		System.out.println("Distance is : " + Math.abs(dist));
	}
	
	public void comparison() {
		if(firstNumber >= secondNumber) {
			System.out.println("Maximum number is : " + firstNumber);
			System.out.println("Minimum number is : " + secondNumber);
		}
		
		else
			
		{
			System.out.println("Maximum number is : " + secondNumber);
			System.out.println("Minimum number is : " + firstNumber);
		}
	}
}
