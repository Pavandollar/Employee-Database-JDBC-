package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class employe 
{
public static void main(String[] args)
{
try 
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection = DriverManager.getConnection("\"jdbc:mysql://localhost:3307/employee","root","root");
PreparedStatement preparedStatement = connection.prepareStatement("insert into employee");
preparedStatement.setInt(1, 103);
preparedStatement.setString(2, "madhan");
preparedStatement.setInt(3, 20);
preparedStatement.setString(4, "ASE");
preparedStatement.setDouble(5, 25000);
preparedStatement.execute();
connection.close();
System.out.println("Data saved");
}
catch(ClassNotFoundException | SQLException e)
  {
	e.printStackTrace();
 }
}
}
