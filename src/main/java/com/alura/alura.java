package com.alura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class alura {
public static void main(String[] args) throws SQLException {
	  Connection con = DriverManager.getConnection(
              "jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
              "root",
              "root1234");
	  
	  con.close();
}
}
