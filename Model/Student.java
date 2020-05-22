package subd.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Student {
	private int id;
	private String familia;
	private String name;
	private String otchestvo;
	private int number_pasport;
	private String phone_number;
	private String email;
	private int specialtyId;
	
	public String toString() {
		String result="";
		result="Student: "+this.id+", "+this.familia+", "+this.name+", "+this.otchestvo+", "+this.number_pasport+", "+
		this.phone_number+", "+this.email+", "+this.specialtyId;
		return result;
	}
}
