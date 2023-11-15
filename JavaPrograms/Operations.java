import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Operations {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
           connection =  Javautil.getJdbcConnection();

           if (connection != null) {
            statement = connection.createStatement();
           }

           if (statement != null) {
            resultSet = statement.executeQuery("select * from students where age > 22");
           }
           if (resultSet != null) {
            
            while (resultSet.next()) {

                System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3)+"\t"+ resultSet.getString(4));

            }
           }
        } catch (Exception e) {
            
        }finally
        {
            try {
                Javautil.closeup(connection, statement, resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
