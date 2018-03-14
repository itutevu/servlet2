package repository;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DatabaseConnector {
	//TODO: chỉnh sửa lại connection properties nếu cần
	public static Connection getConnection(){
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbweb","root","1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
