package Lab4;
import java.util.Scanner;
public class Problema2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] sir = {12, 25, 47, 58, 47, 7, 96, 14, 3, 9};
		
		int poz = -1;
		System.out.println("Position: ");
		poz = tryParse(sc.nextLine());
		
		while(poz == -1 || poz<0 || poz>sir.length-1)
		{
			if(poz == -1)
			System.out.println("Just numbers please ! Try again :)!");
			else
				System.out.println("Only numbers between: [0 and "+(sir.length-1)+"]");
			System.out.println("Position: ");
			poz = tryParse(sc.nextLine());
		}
		for (Integer i : sir)
	        System.out.print(i+" ");
		System.out.println();
		
		for(int i=poz;i<sir.length-1;i++)
			sir[i]=sir[i+1];
		sir[sir.length-1]=null;
		
		 for (Integer i : sir)
		        System.out.print(i+" ");
		sc.close();

	}
	public static int tryParse(String text) {
		  try {
		    return Integer.parseInt(text);
		  } catch (NumberFormatException e) {
		    return -1;
		  }
		}
	

}
