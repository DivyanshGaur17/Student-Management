/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

/**
 *
 * @author shiv
 */
import java.sql.*;
public class DbConnect {
    static Connection con=null;
    public static Connection connect(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/studm?user=root&password=coco9897");
    
    
    }catch(Exception e){
    System.out.println(e);
    }
    return con;
    }
}
