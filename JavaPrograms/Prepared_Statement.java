import java.sql.*;
import java.util.Scanner;

public class Prepared_Statement {
    
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try {
            connection = Javautil.getJdbcConnection();
            // String SqlQuery = "insert into students(name,age,gender) values(?,?,?)";

             String SqlQuery = "select * from students where name = ?";
            if (connection != null) {
                preparedStatement = connection.prepareStatement(SqlQuery);
            }
            if (preparedStatement != null) {
            try (Scanner scanner = new Scanner(System.in)) {
                // System.out.print("Enter Name:");
                // String name =  scanner.next();
                // System.out.print("Enter Age:");
                // int age =  scanner.nextInt();
                // System.out.print("Enter Gender:");
                // String gender =  scanner.next();

                // preparedStatement.setString(1, name);
                // preparedStatement.setInt(2, age);
                // preparedStatement.setString(3, gender);
                System.out.print("Enter Name:");
                String sid =  scanner.next();
                preparedStatement.setString(1, sid);
            }
            // preparedStatement.executeUpdate();
            // resultSet = preparedStatement.executeQuery("Select * from students");

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3)+"\t"+ resultSet.getString(4));

            }
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        finally{
            try {
                Javautil.closeup(connection, preparedStatement, resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
