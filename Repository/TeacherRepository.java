package subd.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TeacherRepository {
	public void Add(String f, String n, String o, Connection connection)throws SQLException{
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("insert into teacher values( nextval('seq_teacher'), " + f+ ", "+ n+ ", "+ o+ ");");
		Read(connection);
	}
	public void Remove(int id, Connection connection) throws SQLException  {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("delete from teacher where id = " + id + ";");
		Read(connection);
	}
	public void Refresh(int id, String f, String n, String o, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("update specialty set familia = '" + f+ "', name = "+n+ "', otchestvo = "+o   +" where id = " + id + ";");
		Read(connection);
	}
	public void Read( Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from teacher;");
		while (rs.next()) {
			String result=rs.getObject(1).toString()+", "+rs.getObject(2).toString()+", "+ 
			rs.getObject(3).toString()+", "+rs.getObject(4).toString();
			System.out.println(result);
		}
	}
}
