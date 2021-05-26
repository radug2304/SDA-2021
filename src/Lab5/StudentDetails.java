package Lab5;

import java.util.*;

public class StudentDetails {
	private String nume;
	private String prenume;
	private List<Double> noteLibRomana = new ArrayList<Double>();
	private List<Double> noteMatematica = new ArrayList<Double>();
	
	public StudentDetails(String nume,String prenume,List<Double> noteLibRomana,List<Double> noteMatematica)
	{
		setNume(nume);
		setPrenume(prenume);
		setNoteLibRomana(noteLibRomana);
		setNoteMatematica(noteMatematica);
	
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public List<Double> getNoteLibRomana() {
		return noteLibRomana;
	}
	public void setNoteLibRomana(List<Double> noteLibRomana) {
		this.noteLibRomana = noteLibRomana;
	}
	public List<Double> getNoteMatematica() {
		return noteMatematica;
	}
	public void setNoteMatematica(List<Double> noteMatematica) {
		this.noteMatematica = noteMatematica;
	}
	
	
}
