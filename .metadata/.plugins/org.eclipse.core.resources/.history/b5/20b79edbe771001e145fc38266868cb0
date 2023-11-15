package com.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DBconnect {
	private DBconnect(){}

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("resource")
	public static Connection getJdbcConnection() throws Exception {
		System.out.println("Connetion Stating");
		HikariConfig config = new HikariConfig(
				"C:\\Users\\sande\\Documents\\Java Projects\\ENotes\\src\\main\\java\\properties\\data.properties");
		HikariDataSource dataSource = new HikariDataSource(config);
		System.out.println("Connetion Stated");
		return dataSource.getConnection();
	}

	public static void closeup(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
		if (connection != null)
			connection.close();
		if (statement != null)
			statement.close();
		if (resultSet != null)
			resultSet.close();

	}
}
