package Lab2;

public class Problema1 {
	public static int vitezaMaxima1(String s) {
		if (s.compareToIgnoreCase("oras") == 0)
			return 50;
		else if (s.compareToIgnoreCase("zona rezidentiala") == 0)
			return 30;
		else if (s.compareToIgnoreCase("drum express") == 0)
			return 100;
		else if (s.compareToIgnoreCase("autostrada") == 0)
			return 130;
		else
			return 0;

	}

	public static int vitezaMaxima2(String s) {
		if (s.compareToIgnoreCase("oras") == 0) {
			return 50;
		} else {
			if (s.compareToIgnoreCase("zona rezidentiala") == 0) {
				return 30;
			} else {
				if (s.compareToIgnoreCase("drum express") == 0) {
					return 100;
				} else {
					if (s.compareToIgnoreCase("autostrada") == 0) {
						return 130;
					} else {
						return 0;
					}
				}
			}
		}

	}

	public static int vitezaMaxima3(String s) {
		String str = s.toLowerCase();
		switch (str) {
		case "oras":
			return 50;
		case "zona rezidentiala":
			return 30;
		case "drum express":
			return 100;
		case "autostrada":
			return 130;
		default:
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println("Varianta if-else");
		System.out.println();
		System.out.println("ORAS-" + vitezaMaxima1("ORAS"));
		System.out.println("Zona Rezidentiala-" + vitezaMaxima1("Zona Rezidentiala"));
		System.out.println("Drum express-" + vitezaMaxima1("Drum Express"));
		System.out.println("Autostrada-" + vitezaMaxima1("Autostrada"));
		System.out.println("Necunoscut-" + vitezaMaxima1("necunoscut"));
		System.out.println();

		System.out.println("Varianta if{}-else{}");
		System.out.println();
		System.out.println("ORAS-" + vitezaMaxima2("ORAS"));
		System.out.println("Zona Rezidentiala-" + vitezaMaxima2("Zona Rezidentiala"));
		System.out.println("Drum express-" + vitezaMaxima2("Drum Express"));
		System.out.println("Autostrada-" + vitezaMaxima2("Autostrada"));
		System.out.println("Necunoscut-" + vitezaMaxima2("necunoscut"));
		System.out.println();
		System.out.println("Varianta switch");
		System.out.println();

		System.out.println("ORAS-" + vitezaMaxima3("ORAS"));
		System.out.println("Zona Rezidentiala-" + vitezaMaxima3("Zona Rezidentiala"));
		System.out.println("Drum express-" + vitezaMaxima3("Drum Express"));
		System.out.println("Autostrada-" + vitezaMaxima3("Autostrada"));
		System.out.println("Necunoscut-" + vitezaMaxima3("necunoscut"));
	}

}
