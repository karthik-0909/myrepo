package com.player;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args) {
		
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver loaded");
			
			String url="jdbc:mysql://localhost:3306/players";
			String username="root";
			String password="Tillu@99";
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("connection established");
			Statement statement=connection.createStatement();
			String sql="select id,name,age,gender,city,sportsName,contact from player order by id";
			
			ResultSet resultSet=statement.executeQuery(sql);
			System.out.println("query executed sucessfully");
			
			while(resultSet.next()) {
				System.out.print("Id :"+resultSet.getInt("id"));
				System.out.print(" Name :"+resultSet.getString("name"));
				System.out.print(" Age:"+resultSet.getInt("age"));
				System.out.print(" Gender :"+resultSet.getString("gender"));
				System.out.print(" City :"+resultSet.getString("city"));
				System.out.print(" SportsName :"+resultSet.getString("sportsName"));
				System.out.print(" Contact :"+resultSet.getLong("contact"));
				System.out.println();
			}
			System.out.println("results processed");
		
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				connection.close();
				System.out.println("connecctin closed");
			} catch (SQLException e) {
				System.out.println(e);
			}			
		}
		
	}

}
