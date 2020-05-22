package subd.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Specialty {
	private int id;
	private String name;
	
	//public List<Subject> subjects;
	//public List<Student>students;
	/*
	public Specialty(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public Specialty() {
		
	}
	*/
	public String toString() {
		String result="";
		result="Specialty: "+this.id+", "+this.name;
		return result;
	}
	/*
	public  String getName() {
		return name;
	}
	public void addElement(String name, Connection connection)throws SQLException{
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("insert into specialty values( nextval('seq_specialty'), '" + name+ ");");
	}
	public void removeElement(int id, Connection connection) throws SQLException  {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("delete from specialty where id = " + id + ";");
	}
	public void refreshElement(int id, String name, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("update specialty set name = '" + name +" where id = " + id + ";");
	}
	public int getId() {
		return id;
	}
	public DefaultTableModel TableModel(Connection connection)throws SQLException {
		Vector<Object> columnNames = null;
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		DefaultTableModel tableModel = new DefaultTableModel();
		columnNames = getTitles();
		data.add(columnNames);
		for (int i = 0; i <= getTable(connection).size()-1; i++) {
			data.add(getTable(connection).get(i).setData(connection));
		}
		tableModel.setDataVector(data, columnNames);
		return tableModel;
	}
	public Vector<Object> getTitles() {
		Vector<Object> columnNames = new Vector<Object>();
		columnNames.add("Id");
		columnNames.add("Название специальности");
		return columnNames;
	}
	public ArrayList<Specialty> getTable(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from specialty;");
		ArrayList<Specialty> res = new ArrayList<>();
		while (rs.next()) {
			res.add(new Specialty(Integer.parseInt(rs.getObject(1).toString()), rs.getObject(2).toString()));
		}
		return res;
	}
	public ArrayList<Specialty> getData(int id, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from specialty where id="+id+";");
		ArrayList<Specialty> res = new ArrayList<>();
		while (rs.next()) {
			res.add(new Specialty(Integer.parseInt(rs.getObject(1).toString()), rs.getObject(2).toString()));
		}
		return res;
	}
	public String getName(int id, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select name from specialty where id="+id+";");
		String res="";
		while (rs.next()) {
			res+=rs.getObject(1).toString();
		}
		return res;
	}
	public Vector<Object> setData(Connection conection) throws SQLException {
		Vector<Object> data = new Vector<Object>();
		data.add(id);
		data.add(name);
		return data;
	}
	public Vector<Object> setDataZapros(Connection conection) throws SQLException {
		Vector<Object> data = new Vector<Object>();
		data.add(name);
		return data;
	}
	public Vector<Integer> getNumber(Connection connection) throws SQLException {
		Statement statement = null;
		System.out.println("number= "+connection);
		statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select id from specialty;");
		Vector<Integer> res = new Vector<Integer>();
		while (rs.next()) {
			res.add(Integer.parseInt(rs.getObject(1).toString()));
		}
		return res;
	}
	*/
}
