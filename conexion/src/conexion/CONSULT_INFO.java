/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CONSULT_INFO {
    Connection con;
    public CONSULT_INFO(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tarandruss","root","1071890819");
              
        } catch (Exception e) {
            System.err.println("Error: " +e);
        }
    }
    public static void main(String[] args)  {
        CONSULT_INFO cn=new CONSULT_INFO();
        Statement st;
        ResultSet rs;   
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("SELECT * FROM COLOR");
            while (rs.next()) {
                System.out.println(rs.getInt("idcolor")+ " " + rs.getString("descripcion"));
            }
            cn.con.close();
        } catch (Exception e) {
        }
        
    }
}   
