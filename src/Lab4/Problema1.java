package Lab4;
import java.util.Arrays;
import java.util.Scanner;
public class Problema1 {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] sir = {12, 25, 47, 58, 47, 7, 96, 14, 3, 9};
		
		Integer poz = null;
		Integer nr = null;
		
		sir = Arrays.copyOf(sir, sir.length + 1);
		System.out.println("Position: ");
		poz = tryParse(sc.nextLine());
		
		while(poz == null || poz<0 || poz>sir.length-1)
		{
			if(poz == null)
			System.out.println("Just numbers please ! Try again :)!");
			else
				System.out.println("Only numbers between: [0 and "+(sir.length-1)+"]");
			System.out.println("Position: ");
			poz = tryParse(sc.nextLine());
		}
			
		
			
		System.out.println("Number: ");
		nr = tryParse(sc.nextLine());
		while(nr == null)
		{
			System.out.println("Just numbers please ! Try again :)!");
			System.out.println("Number: ");
			nr = tryParse(sc.nextLine());
		}
			
		 sc.close();
		for(int i=sir.length-1;i>poz;i--)
			 sir[i]=sir[i-1];
		
		sir[poz]=nr;
		 
		    for (int i : sir)
		        System.out.print(i+" ");
		 

		
		}
			
	
	public static Integer tryParse(String text) {
		  try {
		    return Integer.parseInt(text);
		  } catch (NumberFormatException e) {
		    return null;
		  }
		}
	

}
