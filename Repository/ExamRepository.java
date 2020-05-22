package subd.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExamRepository {
	public void Add(String dateBegin, String dateEnd, int subjectId,int clasId, int teacherId, Connection connection)throws SQLException{
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("insert into exam values( nextval('seq_exam'), '" + dateBegin+ "', '" + dateEnd+ "', "+ subjectId+ ", "+ clasId+ ", "+teacherId+ ");");
		Read(connection);
	}
	public void Remove(int id, Connection connection) throws SQLException  {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("delete from exam where id = " + id + ";");
		Read(connection);
	}
	public void Refresh(int id, String dateBegin, String dateEnd, int subjectId,int clasId, int teacherId, Connection connection) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate("update exam set dateBegin = '" + dateBegin + "', dateEnd = " 
		+ dateEnd + "', subjectId = "+subjectId+"', clasId = "+clasId+"', teacherId = "+teacherId+" where id = " + id + ";");
		Read(connection);
	}
	public void Read(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from exam;");
		while (rs.next()) {
			String result=rs.getObject(1).toString()+", "+rs.getObject(2).toString()+", "+rs.getObject(3).toString()+", "+
		Integer.parseInt(rs.getObject(4).toString())+", "+ Integer.parseInt(rs.getObject(5).toString())+", "+ Integer.parseInt(rs.getObject(6).toString());
			System.out.println(result);
		}
	}
	public void Zapros(Connection connection) throws SQLException {
		Statement statement= connection.createStatement();
		ResultSet rs = statement.executeQuery("select spec.name, sub.name, ex.exam_classid_fkey, ex.datebegin, ex.dateend from subject sub join exam ex on sub.id=ex.exam_subjectid_fkey join specialty spec on spec.id=sub.subject_specialtyid_fkey where ex.datebegin>'2020-06-01' and ex.dateend<'2020-08-20';");
		while (rs.next()) {
			String result=rs.getObject(1).toString()+", "+rs.getObject(2).toString()+", "+Integer.parseInt(rs.getObject(3).toString())+", "+rs.getObject(4)+", "+ 
		rs.getObject(5);
			System.out.println(result);
		}
	}
}
