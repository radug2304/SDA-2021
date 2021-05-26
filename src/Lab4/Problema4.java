package Lab4;

import java.util.ArrayList;
import java.util.List;

import Lab3.Circle;
import Lab3.Rectangle;
import Lab3.Shape;
import Lab3.Square;

public class Problema4 {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();

		shapes.add(new Square("#010101", 1, 7));
		shapes.add(new Square("#010101", 1, 10));
		shapes.add(new Rectangle("#022010", 3, 10, 5));
		shapes.add(new Rectangle("#010321", 1, 5, 10));
		shapes.add(new Circle("#010101", 1, 5));
		shapes.add(new Circle("#FDAE00", 1, 10));
		
	
		String[] colors=new String[shapes.size()+1];
		int counter=0;
		int i=0;
		for(Shape s: shapes) {
			colors[i]=s.getHexFillColor();
			i++;
		}
		
		int j=0;
		for(i=0;i<colors.length-1;i++) {
			counter=1;
			for(j=i+1;j<colors.length;j++)
				if(colors[j] != "") 
				if(colors[i].equals(colors[j])==true) {
					colors[j]="";
					counter++;
				}
			if(colors[i]!="")
			System.out.println(colors[i] + " - " + counter);
				
		}
			
			
		
		

	}

}
