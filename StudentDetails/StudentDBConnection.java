package StudentDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDBConnection
{
       static final String  JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        static final String URL = "jdbc:mysql://localhost:3306/mentorwork";
        static final String USER = "root";
        static final String PASSWORD = "welcome";

        public static Connection getConnection() throws SQLException, ClassNotFoundException {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            return conn;
        }

        public static void closeConnection(Connection conn) throws SQLException {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Database Connection closed");
            }
        }

    }
