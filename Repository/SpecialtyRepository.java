package subd.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SpecialtyRepository {
	public void Add(String name, Connection connection)throws SQLException{
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("insert into specialty values( nextval('seq_specialty'), '" + name+ ");");
		Read(connection);
	}
	public void Remove(int id, Connection connection) throws SQLException  {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("delete from specialty where id = " + id + ";");
		Read(connection);
	}
	public void Refresh(int id, String name, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("update specialty set name = '" + name +" where id = " + id + ";");
		Read(connection);
	}
	public void Read(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from specialty;");
		while (rs.next()) {
			String result=Integer.parseInt(rs.getObject(1).toString())+", "+rs.getObject(2).toString();
			System.out.println(result);
		}
	}
}
