package com.demo.test;

import java.sql.*;

public class TestSqlDemo {
	public static void main() {
		String url = "jdbc:mysql://localhost:3306/your_database_name?useSSL=false";
		String user = "Sairaj21611";
		String password = "Sariaj21611";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name?useSSL=false",
					"Sairaj21611", "Sariaj21611");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM your_table_name");

			while (rs.next()) {
				System.out.println(rs.getString("column1"));
			}

			rs.close();
			stmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
