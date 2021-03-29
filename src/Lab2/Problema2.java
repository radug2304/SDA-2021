package Lab2;

import java.util.ArrayList;
import java.util.List;

public class Problema2 {

	public static void main(String[] args) {
		double temp_array[]= {36.3,36.9,37.1,36.5,38.5};
		List<PatientTemp> normalTemp = new ArrayList<PatientTemp>();
		List<PatientTemp> anormalTemp = new ArrayList<PatientTemp>();
		
		for(int i=0;i<temp_array.length;i++)
		{
			if(temp_array[i]<37.0)
				normalTemp.add(new PatientTemp(i,temp_array[i]));
			else
				anormalTemp.add(new PatientTemp(i,temp_array[i]));
			
		}
		
		for(PatientTemp p : normalTemp)
		{
			System.out.print( "(" + p.temp + "," + p.id + ") " );
			
		}
		System.out.println();
		
		for(PatientTemp p : anormalTemp)
		{
			System.out.print( "(" + p.temp + "," + p.id + ") " );
			
		}
		System.out.println();
		
		

	}

}
