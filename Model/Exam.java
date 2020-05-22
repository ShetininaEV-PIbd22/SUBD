package subd.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Exam {
	private int id;
	private Date dateBegin;
	private Date dateEnd;
	private int subjectId;
	private int clasId;
	private int teacherId;
	
	//Clas clas;
	//Subject subject;
	//Teacher teacher;
	/*
	private String Spec_name;
	private String Sub_name;
	
	public Exam(int id , Date date, Date date2, int subjectId,int clasId, int teacherId) {
		this.id=id;
		this.dateBegin=date;
		this.dateEnd=date2;
		this.subjectId=subjectId;
		this.clasId=clasId;
		this.teacherId=teacherId;
	}
	public Exam() {
		
	}
	public Exam(int id) {
		this.id=id;
	}
	public Exam (String sp, String sub, int clasid, Date db, Date de) {
		this.Spec_name=sp;
		this.Sub_name=sub;
		this.clasId=clasid;
		this.dateBegin=db;
		this.dateEnd=de;
	}
	*/
	public String toString() {
		String result="";
		result="Exam: "+this.id+", "+this.dateBegin+", "+this.dateEnd+", "+this.subjectId+", "+this.clasId+", "+this.teacherId;
		return result;
	}
	/*
	public void addElement(String dateBegin, String dateEnd, int subjectId,int clasId, int teacherId, Connection connection)throws SQLException{
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("insert into exam values( nextval('seq_exam'), '" + dateBegin+ "', " + dateEnd+ "', "+ subjectId+ "', "+ clasId+ "', "+teacherId+ ");");
	}
	public void removeElement(int id, Connection connection) throws SQLException  {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("delete from exam where id = " + id + ";");
	}
	public void refreshElement(int id, String dateBegin, String dateEnd, int subjectId,int clasId, int teacherId, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("update exam set dateBegin = '" + dateBegin + "', dateEnd = " 
		+ dateEnd + "', subjectId = "+subjectId+"', clasId = "+clasId+"', teacherId = "+teacherId+" where id = " + id + ";");
	}
	public ArrayList<Exam> getData(int id, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from exam where id="+id+";");
		ArrayList<Exam> res = new ArrayList<>();
		while (rs.next()) {
			res.add(new Exam(Integer.parseInt(rs.getObject(1).toString()), (Date)rs.getObject(2),
					(Date)rs.getObject(3), Integer.parseInt(rs.getObject(4).toString()), 
					Integer.parseInt(rs.getObject(5).toString()), Integer.parseInt(rs.getObject(6).toString())));
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
		for (int i = 0; i <= getTable(connection).size()-1; i++) {
			data.add(getTable(connection).get(i).setData(connection));
		}
		tableModel.setDataVector(data, columnNames);
		return tableModel;
	}
	public Vector<Object> getTitles() {
		Vector<Object> columnNames = new Vector<Object>();
		columnNames.add("Id");
		columnNames.add("Дата начала");
		columnNames.add("Дата окончания");
		columnNames.add("Id предмета");
		columnNames.add("№ аудитории");
		columnNames.add("Id преподавателя");
		return columnNames;
	}
	public ArrayList<Exam> getTable(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from exam;");
		ArrayList<Exam> res = new ArrayList<>();
		while (rs.next()) {
			res.add(new Exam(Integer.parseInt(rs.getObject(1).toString()), (Date)rs.getObject(2),  (Date)rs.getObject(3), Integer.parseInt(rs.getObject(4).toString()), Integer.parseInt(rs.getObject(5).toString()), Integer.parseInt(rs.getObject(6).toString())));//, (int)rs.getObject(4)));
		}
		return res;
	}
	public Vector<Object> setData(Connection conection) throws SQLException {
		Vector<Object> data = new Vector<Object>();
		data.add(id);
		data.add(dateBegin);
		data.add(dateEnd);
		data.add(subjectId);
		data.add(clasId);
		data.add(teacherId);
		return data;
	}
	public ArrayList<Exam> getNumber(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from exam;");
		ArrayList<Exam> res = new ArrayList<>();
		while (rs.next()) {
			res.add(new Exam(Integer.parseInt(rs.getObject(1).toString())));
		}
		return res;
	}
	
	public DefaultTableModel getZapros(Connection connection) throws SQLException {
		Statement statement= connection.createStatement();
		ResultSet rs = statement.executeQuery("select spec.name, sub.name, ex.exam_classid_fkey, ex.datebegin, ex.dateend from subject sub join exam ex on sub.id=ex.exam_subjectid_fkey join specialty spec on spec.id=sub.subject_specialtyid_fkey where ex.datebegin>'2020-06-01' and ex.dateend<'2020-08-20';");
		ArrayList<Exam> res = new ArrayList<>();
		while (rs.next()) {
			res.add(new Exam(rs.getObject(1).toString(), rs.getObject(2).toString(), Integer.parseInt(rs.getObject(3).toString()), (Date)rs.getObject(4), (Date)rs.getObject(5)));
		}
		Vector<Object> columnNames = null;
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		DefaultTableModel tableModel = new DefaultTableModel();
		columnNames = getTitles1();
		data.add(columnNames);
		for (int i = 0; i <= res.size()-1; i++) {
			data.add(res.get(i).setDataZapros(connection));
		}
		tableModel.setDataVector(data, columnNames);
		return tableModel;
	}
	public Vector<Object> getTitles1() {
		Vector<Object> columnNames = new Vector<Object>();
		columnNames.add("Специальность");
		columnNames.add("Предмет");
		columnNames.add("№ аудитории");
		columnNames.add("Дата начала");
		columnNames.add("Дата окончания");
		return columnNames;
	}
	public Vector<Object> setDataZapros(Connection conection) throws SQLException {
		Vector<Object> data = new Vector<Object>();
		data.add(Spec_name);
		data.add(Sub_name);
		data.add(clasId);
		data.add(dateBegin);
		data.add(dateEnd);
		return data;
	}
	*/
}
