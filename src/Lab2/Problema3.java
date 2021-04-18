package Lab2;

public class Problema3 {

	public static void main(String[] args) {
		Adress address=new Adress("Brasov","Al. Ioan Cuza",64);
		
		PaymentMethod pm= new PaymentMethod("card");
		
		Customer c = new Customer(address, pm, "Radu", "Iovanovici", 21);
		
		System.out.println(c.getCompleteName());
		
		System.out.println(c.getAdress().getFullAdress());
		
		System.out.println(c.getPaymentMethod().getType());
		

	}

}
