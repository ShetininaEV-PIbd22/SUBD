package subd.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRepository {
	public void Add(String f, String n, String o, int np, String pn, String email, int specialtyId, Connection connection)throws SQLException{
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("insert into student values( nextval('seq_student'), '"+"familia"  + f+"', name"+ n+"', otchestvo"+o 
		+"', number_pasport"+ np+"', phonenumber"+pn+"', email"+email+"', student_specialtyid_fkey"+specialtyId+");");
		Read(connection);
	}
	public void Remove(int id, Connection connection) throws SQLException  {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("delete from student where id = " + id + ";");
		Read(connection);
	}
	public void Refresh(int id, String f, String n, String o, int np, String pn, String email, int specialtyId, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("update student set familia = '" + f+"', name '"+ n+"', otchestvo '"+o 
				+"', number_pasport"+ np+"', phonenumber '"+pn+"', email '"+email+"', student_specialtyid_fkey"+specialtyId//+ "', otchestvo = "+o   
				+" where id = " + id + ";");
		Read(connection);
	}
	public void Read(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from student;");
		while (rs.next()) {
			String result=Integer.parseInt(rs.getObject(1).toString())+", "+rs.getObject(2).toString()+", "+
		rs.getObject(3).toString()+", "+rs.getObject(4).toString()+", "+Integer.parseInt(rs.getObject(5).toString())
		+", "+rs.getObject(6).toString()+", "+rs.getObject(7).toString()+", "+Integer.parseInt(rs.getObject(8).toString());
			System.out.println(result);
		}
	}
	public void Zapros(Connection connection) throws SQLException {
		Statement statement= connection.createStatement();
		ResultSet rs = statement.executeQuery("select familia, name, otchestvo, count(*) over(partition by student_specialtyid_fkey) from student;");
		while (rs.next()) {
			String result=rs.getObject(1).toString()+", "+ rs.getObject(2).toString()+", "+rs.getObject(3).toString()+", "+Integer.parseInt(rs.getObject(4).toString());
			System.out.println(result);
		}
		}
}
