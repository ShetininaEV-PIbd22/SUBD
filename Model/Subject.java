package subd.Model;


public class Subject {
	private int id;
	private String name;
	private int specialtyId;
	
	public String toString() {
		String result="";
		result="Subject: "+this.id+", "+this.name+", "+this.specialtyId;
		return result;
	}
}
