package subd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import subd.Repository.*;
import java.sql.Timestamp;

public class Main {

	private static String host="localhost";
	private  static String port="5432";
	private static String bd="subd";
	private static String user="postgres";
	private static String password="liza";
	static Connection connection;
	
	public static void main(String[] args) throws SQLException {
		Connection();
		if (connection!= null) {
			System.out.println("Соединение произошло успешно");
		}
		ClasRepository(connection);
		TeacherRepository(connection);
		ExamRepository(connection);
		SpecialtyRepository(connection);
		StudentRepository(connection);
		SubjectRepository(connection);
	}
	public static void Connection() {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://" + host + ":" + port + "/" + bd;
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException ex) {
				System.out.println(ex.getMessage());
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
	}
	public static void ClasRepository(Connection connection) throws SQLException {
		System.out.println("Class");
		System.out.println("-------------------------------------");
		ClassRepository cr=new ClassRepository();
		Timestamp start = new Timestamp(System.currentTimeMillis());
		cr.Read(connection);
		Timestamp end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		cr.Remove(7, connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		cr.Add("Лекция3", 3232, connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		cr.Refresh(6, "Лекция2", 3500, connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
	}
	public static void TeacherRepository(Connection connection) throws SQLException{
		TeacherRepository tr=new TeacherRepository();
		Timestamp start = new Timestamp(System.currentTimeMillis());
		tr.Read(connection);
		Timestamp end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		tr.Add("Александров", "Алексей", "Алексеевич", connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		tr.Remove(7, connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		tr.Refresh(2, "Морозова", "Надежда", "Петровна", connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		System.out.println("-------------------------------------");
	}
	public static void ExamRepository(Connection connection) throws SQLException{
		ExamRepository er=new ExamRepository();
		Timestamp start = new Timestamp(System.currentTimeMillis());
		er.Read(connection);
		Timestamp end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		er.Add("2020-05-22", "2020-05-23", 1, 6, 5, connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		er.Remove(9, connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		er.Refresh(2, "2020-05-20", "2020-05-31", 2, 1, 4, connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		System.out.println("-------------------------------------");
		
		System.out.println("Запрос 3");
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		er.Zapros(connection);
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		System.out.println("-------------------------------------");
	}
	public static void SpecialtyRepository(Connection connection) throws SQLException{
		SpecialtyRepository spr=new SpecialtyRepository();
		Timestamp start = new Timestamp(System.currentTimeMillis());
		spr.Read(connection);
		Timestamp end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		spr.Add("Радиотехник", connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		spr.Remove(8, connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		spr.Refresh(3, "Прикладная информатика", connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		System.out.println("-------------------------------------");
	}
	public static void StudentRepository(Connection connection) throws SQLException{
		StudentRepository str=new StudentRepository();
		Timestamp start = new Timestamp(System.currentTimeMillis());
		str.Read(connection);
		Timestamp end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		str.Remove(5, connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		str.Add("Каштанкие", "Илья", "Тимофеевич", 0000, "6589765710", "itk@gmail.com", 3, connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		str.Refresh(4,"Гвоздьев", "Марат", "Александрович", 4684, "9248517895", "Gvozd@bk.ru", 3, connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		System.out.println("-------------------------------------");
	
		System.out.println("Запрос 2");
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		str.Zapros(connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		System.out.println("-------------------------------------");
	}
	public static void SubjectRepository(Connection connection) throws SQLException{
		SubjectRepository sur=new SubjectRepository();
		Timestamp start = new Timestamp(System.currentTimeMillis());
		sur.Read(connection);
		Timestamp end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		sur.Add("Русский язык", 5, connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		sur.Remove(11, connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		
		
		
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		sur.Refresh(10,"Математика(профиль)", 4, connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		System.out.println("-------------------------------------");
	
		System.out.println("Запрос 1");
		System.out.println("-------------------------------------");
		start = new Timestamp(System.currentTimeMillis());
		sur.Zapros(connection);
		end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		System.out.println("-------------------------------------");
	}

}
