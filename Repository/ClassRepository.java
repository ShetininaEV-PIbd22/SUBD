package subd.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import subd.Model.Clas;

public class ClassRepository {
	public void Add(String type, int vmestimost, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("insert into class values( nextval('seq_class'), '" + type + "', " + vmestimost + ");");
		Read(connection);
	}
	public void Remove(int id, Connection connection) throws SQLException  {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("delete from class where id = " + id + ";");
		Read(connection);
	}
	public void Refresh(int id, String type, int vmestimost, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("update class set type = '" + type + "', vmestimost = " + vmestimost + " where id = " + id + ";");
		Read(connection);
	}
	public void Read( Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from class;");
		while (rs.next()) {
			String result=rs.getObject(1).toString()+", "+rs.getObject(2).toString()+", "+rs.getObject(3).toString();
			System.out.println(result);
		}
	}
}
