package subd.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SubjectRepository {
	public void Add(String name, int specialtyId, Connection connection)throws SQLException{
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("insert into subject values( nextval('seq_subject'), '" + name+ "', " 
		+ specialtyId+");");
		Read(connection);
	}
	public void Remove(int id, Connection connection) throws SQLException  {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("delete from subject where id = " + id + ";");
		Read(connection);
	}
	public void Refresh(int id, String name, int specialtyId, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("update subject set name = '" + name+ "', subject_specialtyid_fkey = "+specialtyId//+ "', otchestvo = "+o   
				+" where id = " + id + ";");
		Read(connection);
	}
	public void Read(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from subject;");
		while (rs.next()) {
			String result=Integer.parseInt(rs.getObject(1).toString())+", "+rs.getObject(2).toString()+", "+
		Integer.parseInt(rs.getObject(3).toString());
			System.out.println(result);
		}
	}
	public void Zapros(Connection connection) throws SQLException {
		Statement statement= connection.createStatement();
		ResultSet rs = statement.executeQuery("select name from subject where  subject_specialtyid_fkey in (select id from specialty where name='Прикладная информатика') ORDER BY id ASC;");
		while (rs.next()) {
			String result=rs.getObject(1).toString();
			System.out.println(result);
		}
	}
}
