package Lab3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Alegeti modul de desenare:");
		System.out.println("A - automat");
		System.out.println("M - manual");
		String option = sc.nextLine();

		if (option.toUpperCase().compareTo("A") == 0) {

			List<Shape> shapes = new ArrayList<Shape>();

			shapes.add(new Square("#010101", 1, 7));
			shapes.add(new Square("#010101", 1, 10));
			shapes.add(new Rectangle("#022010", 3, 10, 5));
			shapes.add(new Rectangle("#010321", 1, 5, 10));
			shapes.add(new Circle("#CCC908", 1, 5));
			shapes.add(new Circle("#FDAE00", 1, 10));
		
	
			for (Shape s : shapes) {
				System.out.println("Shape Name : " + s.getName());
				System.out.println("Shape Area : " + s.getArea());
				System.out.println("Shape FillColor : " + s.getHexFillColor());
				System.out.println("Shape BorderWidth : " + s.getBorderWidth());
				System.out.println("Drawing . . . . ");

				s.draw();

				System.out.println();
			}

		}

		else if (option.toUpperCase().compareTo("M") == 0) {

			System.out.println("Ce doriti sa construiti?");
			System.out.println("P pentru patrat!");
			System.out.println("D pentru dreptungi!");
			System.out.println("C pentru cerc!");

			String opt = sc.nextLine();

			switch (opt.toUpperCase()) {
			case "P":
				System.out.println("Introduceti o culoare de forma '#000000' !");
				String squareColor = sc.nextLine();
				System.out.println("Introduceti lungimea patratului (numar pozitiv) !");
				int size = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceti grosimea conturului (numar pozitiv) !");
				int squareBorder = Integer.parseInt(sc.nextLine());

				Shape s = new Square(squareColor, squareBorder, size);
				System.out.println("Shape Name : " + s.getName());
				System.out.println("Shape Area : " + s.getArea());
				System.out.println("Shape FillColor : " + s.getHexFillColor());
				System.out.println("Shape BorderWidth : " + s.getBorderWidth());
				System.out.println("Drawing . . . . ");
				s.draw();
				break;

			case "C":
				System.out.println("Introduceti o culoare de forma '#000000' !");
				String circleColor = sc.nextLine();
				System.out.println("Introduceti raza cercului (numar pozitiv) !");
				int radius = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceti grosimea conturului (numar pozitiv) !");
				int circleBorder = Integer.parseInt(sc.nextLine());

				Shape s1 = new Circle(circleColor, circleBorder, radius);
				System.out.println("Shape Name : " + s1.getName());
				System.out.println("Shape Area : " + s1.getArea());
				System.out.println("Shape FillColor : " + s1.getHexFillColor());
				System.out.println("Shape BorderWidth : " + s1.getBorderWidth());
				System.out.println("Drawing . . . . ");
				s1.draw();
				break;

			case "D":
				System.out.println("Introduceti o culoare de forma '#000000' !");
				String rectangleColor = sc.nextLine();
				System.out.println("Introduceti lungimea dreptunghiului (numar pozitiv) !");
				int rectangleHeight = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceti latimea dreptunghiului (numar pozitiv) !");
				int rectangleWidth = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceti grosimea conturului (numar pozitiv) !");
				int rectangleBorder = Integer.parseInt(sc.nextLine());

				Shape s2 = new Rectangle(rectangleColor, rectangleBorder, rectangleHeight, rectangleWidth);
				System.out.println("Shape Name : " + s2.getName());
				System.out.println("Shape Area : " + s2.getArea());
				System.out.println("Shape FillColor : " + s2.getHexFillColor());
				System.out.println("Shape BorderWidth : " + s2.getBorderWidth());
				System.out.println("Drawing . . . . ");
				s2.draw();
				break;
			}

		}

		sc.close();

	}
}
