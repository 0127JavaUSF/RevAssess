package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    public static Connection getConnectionUtil(){
        String url = System.getenv("JDBC_URL1");
        String password = System.getenv("JDBC_PASSWORD1");
        String role = System.getenv("JDBC_ROLE1");
        try {
            return DriverManager.getConnection(url,role,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
