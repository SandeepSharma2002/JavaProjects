import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Javautil {
    private Javautil(){

    }

    public static Connection getJdbcConnection() throws IOException, SQLException{
        
        FileInputStream fis = new FileInputStream("app.properties");
        Properties properties = new Properties();
        properties.load(fis);

        Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"),properties.getProperty("password"));
        return connection;
    }

    public static void closeup(Connection con, Statement st, ResultSet rset) throws SQLException 
    {
        if (con != null) {
            con.close();
        }
         if (st != null) {
            st.close();
        }
         if (rset != null) {
            rset.close();
        }
    }
}
