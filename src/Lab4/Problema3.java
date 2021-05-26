package Lab4;

public class Problema3 {

	public static void main(String[] args) {
		int[] sir = {1, 10, 12,14,27,30,31,35,40,100};
		
		
		for(int i : sir)
			print(sir,i);
		
		print(sir,150);
		
		
		
	
	}
	 static boolean search(int sir[], int left, int right, int nr)
	    {
	        if (right >= left) {
	            int middle = left + (right - left) / 2;
	 
	            if (sir[middle] == nr)
	                return true;
	 
	            if (sir[middle] > nr)
	                return search(sir, left, middle - 1, nr);
	 
	            return search(sir, middle + 1, right, nr);
	        }
	 
	        return false;
	    }
	 
		public static void print(int sir[],int nr) {
			System.out.print("[");
			for (int i : sir)
		        System.out.print(i+" ");
			System.out.print("]");
			System.out.println();
			System.out.println(nr);
			System.out.println(search(sir,0,sir.length-1,nr));
			System.out.println("==============><==============");
		}
	

}
