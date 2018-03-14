package repository;

import com.mysql.jdbc.Statement;
import domain.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {
	// TODO: check láº¡i query, parse User tá»« resultset, close connection
	public static User findByUsername(String username) {
        try {
            Statement st=(Statement) DatabaseConnector.getConnection().createStatement();
            ResultSet rs = null;
            String query = "select * from user where UserName='"+username+"'";
            System.out.println(query);
            rs = st.executeQuery(query);
            if(rs.next()){
                return new User(rs.getString(0), rs.getString(1), rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

	public static User insertOrUpdate(User user) {
		// TODO: impelemt náº¿u cáº§n
		return null;
	}

	public static void delete(User user) {
		// TODO: impelemt náº¿u cáº§n
	}
}
