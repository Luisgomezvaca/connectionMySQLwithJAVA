/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class INSERT_INFO {
    Connection con;
    public INSERT_INFO(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tarandruss","root","1071890819");
              
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error: " +e);
        }
    }
    public static void main(String[] args)  {
        INSERT_INFO cn=new INSERT_INFO();
        Statement st;
        try {
            st=cn.con.createStatement();
            st.executeUpdate("INSERT INTO color (idcolor,descripcion) VALUES (106,'Blanco')");
            System.out.println("Se agregó un nuevo dato en la tabla.");
            cn.con.close();
        } catch (SQLException e) {
        }
        
    }
}   