import java.sql.*;
import java.util.Scanner;

public class JDBC {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;

        Scanner scanner = new Scanner(System.in);

        try {
            // Load and register the driver
            // Its optional JVM automatically Load this.
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Loaded Successfully...");

            // Establish the connection with Database
            String url = "jdbc:mysql://localhost:3305/student";
            String userName = "root";
            String password = "12345";
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Classname " + connection.getClass().getName());

            // Create statement object and send the query

            // String sqlSelectQuery = "select sid,name,age,gender from students";
            // statement =  connection.createStatement();
            // System.out.println("Classname " + statement.getClass().getName());
            // resultSet = statement.executeQuery(sqlSelectQuery);
            // System.out.println("Classname " + resultSet.getClass().getName());
            // String sqlDeleteQuery = "delete from students where sid = 3";
            // statement =  connection.createStatement();
            // statement.executeUpdate(sqlDeleteQuery);

            // String sqlInsertQuery = "Insert into students(sid,name,age,gender) values(5,'Hiyansh',21,'Gay')";
            // statement =  connection.createStatement();
            // statement.executeUpdate(sqlInsertQuery);
            // resultSet = statement.executeQuery("select * from students");

            System.out.print("Enter Name:");
            String sname =  scanner.next();
            System.out.print("Enter Age:");
            int sage =  scanner.nextInt();
            System.out.print("Enter Gender:");
            String sgender =  scanner.next();

            // String sqlInsertQuery = "Insert into students(name,age,gender) values('"+sname+"',"+sage+",'"+sgender+"')";
            String sqlInsertQuery = String.format("Insert into students(name,age,gender) values('%s',%d,'%s')",sname, sage, sgender);
            
            statement =  connection.createStatement();
            statement.executeUpdate(sqlInsertQuery);
            resultSet = statement.executeQuery("select * from students");


            
            // Process the resultSet

            while (resultSet.next()) {

                Integer sid = resultSet.getInt(1);
                String name = resultSet.getString(2);
                Integer age = resultSet.getInt(3);
                String gender = resultSet.getString(4);

                System.out.println(sid +"\t"+ name+"\t"+age+"\t"+gender);
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally{
            if (connection != null) {
                try {
                    scanner.close();
                    connection.close();
                    System.out.println("Connection Closed...");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}