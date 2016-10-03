/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.jamy;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author evilnapsis
 */
public class Database {
    public static Connection connect(){
String url = "jdbc:mysql://localhost:3306/crud2";
String user = "root";
String pass = "";
System.out.println("Conectando...");
Connection connection=null;
try
{
    connection = DriverManager.getConnection(url, user,pass);
    
}catch(SQLException e){
System.out.println(e.getMessage());
}
return connection;
}
    
    public static void query(String sql){
        try{
    Statement s = connect().createStatement();
    s.executeUpdate(sql);
        }catch(SQLException e){
System.out.println(e.getMessage());
}
    }
       public static ResultSet result(String sql){
           ResultSet r=null;
        try{
    Statement s = connect().createStatement();
    r=s.executeQuery(sql);
        }catch(SQLException e){
System.out.println(e.getMessage());
}
        return r;
    } 
}
