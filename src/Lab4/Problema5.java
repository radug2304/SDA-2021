package Lab4;

import java.util.Random;

public class Problema5 {
	public static int[][] a=new int[10][10];
	public static void main(String[] args) {
		int i=0;
		int j=0;
		int n=4;
		int m=5;
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				a[i][j]= new Random().nextInt(255);
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++)
				System.out.print(a[i][j]+" ");
	
		System.out.println();
		}
		
		int n_fin=n;
		int m_fin=m;
		
		while((n_fin)%3!=0)
			n_fin++;
		
		while((m_fin)%3!=0)
			m_fin++;
		
		System.out.println("========================================");
		System.out.println("========================================");
		for(i=0;i<n_fin;i++) 
			for(j=0;j<m_fin;j++)
				if((i-2)%3==0 && (j-2)%3==0) {
					calcul(i,j);
				}
	
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++)
				System.out.print(a[i][j]+" ");
		System.out.println();

	}
		

}
	public static void calcul(int linie , int coloana)
	{
		int suma=0;
		int nr_elemente=0;
		for(int i=linie-2;i<=linie;i++)
		{
			for(int j=coloana-2;j<=coloana;j++) {
				if(a[i][j]!=256) {
				suma+=a[i][j];
				nr_elemente++;
				}
		}

	}
		for(int i=linie-2;i<=linie;i++)
		{
			for(int j=coloana-2;j<=coloana;j++) {
				a[i][j]=suma/nr_elemente;
		}

	}

}
}
