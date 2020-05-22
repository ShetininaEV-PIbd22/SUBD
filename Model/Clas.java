package subd.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Clas {
	private int id;
	private String type;
	private int vmestimost;
	
	//Exam exam;
	
	/*
	public Clas(int id ,String type, int vmestimost) {
		this.id=id;
		this.type=type;
		this.vmestimost=vmestimost;
	}
	public Clas() {
		
	}
	*/
	public String toString() {
		String result="";
		result="Class: "+this.id+", "+this.type+", "+this.vmestimost;
		return result;
	}
	/*
	public void addElement( String type, int vmestimost, Connection connection)throws SQLException{
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("insert into class values( nextval('seq_class'), '" + type + "', " + vmestimost + ");");
	}
	public void removeElement(int id, Connection connection) throws SQLException  {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("delete from class where id = " + id + ";");
	}
	public void refreshElement(int id, String type, int vmestimost, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("update class set type = '" + type + "', vmestimost = " + vmestimost + " where id = " + id + ";");
	}
	public ArrayList<Clas> getData(int id, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from class where id="+id+";");
		ArrayList<Clas> res = new ArrayList<>();
		while (rs.next()) {
			res.add(new Clas(Integer.parseInt(rs.getObject(1).toString()), rs.getObject(2).toString(), Integer.parseInt(rs.getObject(3).toString())));
		}
		return res;
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
		for (int i = 0; i <= getTable(connection).size() - 1; i++) {
			data.add(getTable(connection).get(i).setData(connection));
		}
		tableModel.setDataVector(data, columnNames);
		return tableModel;
	}
	public Vector<Object> getTitles() {
		Vector<Object> columnNames = new Vector<Object>();
		columnNames.add("Id");
		columnNames.add("Тип");
		columnNames.add("Вместимость");
		return columnNames;
	}
	public ArrayList<Clas> getTable(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from class;");
		ArrayList<Clas> res = new ArrayList<>();
		while (rs.next()) {
			res.add(new Clas(Integer.parseInt(rs.getObject(1).toString()), rs.getObject(2).toString(), Integer.parseInt(rs.getObject(3).toString())));//, (int)rs.getObject(4)));
		}
		return res;
	}
	public Vector<Object> setData(Connection conection) throws SQLException {
		Vector<Object> data = new Vector<Object>();
		data.add(id);
		data.add(type);
		data.add(vmestimost);
		return data;
	}
	public Vector<Object> setDataZapros(Connection conection) throws SQLException {
		Vector<Object> data = new Vector<Object>();
		data.add(id);
		return data;
	}
	public int maxId(Connection connection)throws SQLException {
		int max=0;
		for (int i = 0; i < getTable(connection).size()-1; i++) {
			if (i>i+1)
				max=i;
		}
		return max;
	}
	public Vector<Integer> getNumber(Connection connection) throws SQLException {
		Statement statement = null;
		System.out.println("number= "+connection);
		statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select id from class;");
		Vector<Integer> res = new Vector<Integer>();
		while (rs.next()) {
			res.add(Integer.parseInt(rs.getObject(1).toString()));
		}
		return res;
	}
	*/
}
