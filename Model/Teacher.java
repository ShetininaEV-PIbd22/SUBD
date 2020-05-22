package subd.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Teacher {
	private int id;
	private String familia;
	private String name;
	private String otchestvo;
	
	//Exam exam;
	/*
	public Teacher(int id, String f, String n, String o) {
		this.id=id;
		this.familia=f;
		this.name=n;
		this.otchestvo=o;
	}
	public Teacher() {
		
	}
	*/
	public String toString() {
		String result="";
		result="Teacher: "+this.id+", "+this.familia+", "+this.name+", "+this.otchestvo;
		return result;
	}
	/*
	public void addElement(String f, String n, String o, Connection connection)throws SQLException{
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("insert into teacher values( nextval('seq_teacher'), '" + f+ "', " 
		+ n+ "', "+ o+ ");");
	}
	public void removeElement(int id, Connection connection) throws SQLException  {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("delete from teacher where id = " + id + ";");
	}
	public void refreshElement(int id, String f, String n, String o, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("update specialty set familia = '" + f+ "', name = "+n+ "', otchestvo = "+o   +" where id = " + id + ";");
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
	public ArrayList<Teacher> getData(int id, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from teacher where id="+id+";");
		ArrayList<Teacher> res = new ArrayList<>();
		while (rs.next()) {
			res.add(new Teacher(Integer.parseInt(rs.getObject(1).toString()), rs.getObject(2).toString(), 
					rs.getObject(3).toString(), rs.getObject(4).toString()));
		}
		return res;
	}
	public Vector<Object> getTitles() {
		Vector<Object> columnNames = new Vector<Object>();
		columnNames.add("Id");
		columnNames.add("Фамилия");
		columnNames.add("Имя");
		columnNames.add("Отчество");
		return columnNames;
	}
	public ArrayList<Teacher> getTable(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from teacher;");
		ArrayList<Teacher> res = new ArrayList<>();
		while (rs.next()) {
			res.add(new Teacher(Integer.parseInt(rs.getObject(1).toString()), rs.getObject(2).toString(), rs.getObject(3).toString(), rs.getObject(4).toString()));
		}
		return res;
	}
	public Vector<Object> setData(Connection conection) throws SQLException {
		Vector<Object> data = new Vector<Object>();
		data.add(id);
		data.add(familia);
		data.add(name);
		data.add(otchestvo);
		return data;
	}
	public Vector<Integer> getNumber(Connection connection) throws SQLException {
		Statement statement = null;
		System.out.println("number= "+connection);
		statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select id from teacher;");
		Vector<Integer> res = new Vector<Integer>();
		while (rs.next()) {
			res.add(Integer.parseInt(rs.getObject(1).toString()));
		}
		return res;
	}
	*/
}
