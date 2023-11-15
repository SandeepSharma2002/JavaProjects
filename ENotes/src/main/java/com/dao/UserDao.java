package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.User.UserDetails;
import com.db.DBconnect;

public class UserDao implements IUserDao {

	PreparedStatement pStatement = null;
	Connection connection = null;
	ResultSet resultSet = null;
	String sqlQuery = null;

	@Override
	public String addUser(UserDetails user) {
		try {
			connection = DBconnect.getJdbcConnection();
			sqlQuery = "insert into user (Name,Email,Password) values (?,?,?)";
			if (connection != null) {
				pStatement = connection.prepareStatement(sqlQuery);
				pStatement.setString(1, user.getName());
				pStatement.setString(2, user.getEmail());
				pStatement.setString(3, user.getPassword());
				int result = pStatement.executeUpdate();
				if (result == 1)
					return "success";
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DBconnect.closeup(connection, pStatement, resultSet);
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return "failure";
	}

	@Override
	public UserDetails LoginUser(String UserEmail, String UserPassword) {
		UserDetails user = null;
		try {
			connection = DBconnect.getJdbcConnection();
			sqlQuery = "select * from user where email=? and password=?";
			if (connection != null) {
				pStatement = connection.prepareStatement(sqlQuery);
				pStatement.setString(1, UserEmail);
				pStatement.setString(2, UserPassword);
				resultSet = pStatement.executeQuery();
				user = new UserDetails();
				if (resultSet.next() == true) {
					
					user.setId(resultSet.getInt(1));
					user.setName(resultSet.getString(2));
					user.setEmail(resultSet.getString(3));
					user.setPassword(resultSet.getString(4));
				}
				System.out.println(user);
					return user;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DBconnect.closeup(connection, pStatement, resultSet);
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return user;
	}
}
