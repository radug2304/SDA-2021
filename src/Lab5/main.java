package Lab5;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> noteMate = new ArrayList<Double>();
		List<Double> noteRomana = new ArrayList<Double>();
		
		noteMate.add(5.0);
		noteMate.add(7.2);
		noteMate.add(8.1);
		
		noteRomana.add(5.0);
		noteRomana.add(6.0);
		noteRomana.add(7.0);
	
		
		//Map<String, StudentDetails> hm = new LinkedHashMap<String, StudentDetails>();
		Map<String, StudentDetails> hm = new HashMap<String, StudentDetails>();
		
		hm.put("101", new StudentDetails("nume0", "prenume0",noteMate,noteRomana));
		hm.put("100", new StudentDetails("nume1", "prenume1",noteMate,noteRomana));
		hm.put("103", new StudentDetails("nume2", "prenume2",noteMate,noteRomana));
		hm.put("102", new StudentDetails("nume3", "prenume3",noteMate,noteRomana));
		hm.put("104", new StudentDetails("nume4", "prenume4",noteMate,noteRomana));
		hm.put("105", new StudentDetails("nume5", "prenume5",noteMate,noteRomana));
		hm.put("106", new StudentDetails("nume6", "prenume6",noteMate,noteRomana));
		hm.put("107", new StudentDetails("nume7", "prenume7",noteMate,noteRomana));
		hm.put("108", new StudentDetails("nume8", "prenume8",noteMate,noteRomana));
		hm.put("109", new StudentDetails("nume9", "prenume9",noteMate,noteRomana));
		hm.put("109", new StudentDetails("nume10", "prenume10",noteMate,noteRomana));
		System.out.println("Introduceti CNP-ul elevului:");
		String cnp = sc.nextLine();
		
		System.out.println("Nume: "+hm.get(cnp).getNume());
		System.out.println("Prenume: "+hm.get(cnp).getPrenume());
		System.out.println("Note limba romana: "+hm.get(cnp).getNoteLibRomana());
		System.out.println("Note matematica: "+hm.get(cnp).getNoteMatematica());
		
		System.out.println("-------> Lista CNP-uri studenti <-------");
		for(String key : hm.keySet())
		{
			System.out.println("CNP:" + key);
		}
			
	}

}
