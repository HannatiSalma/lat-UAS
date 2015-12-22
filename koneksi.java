/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tashrif;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hannati
 */
public class koneksi {
    public Connection con;
    public Statement cn;
    public void openConnection(String db, String user, String pass){
try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,user,pass);
            cn = con.createStatement();
        }
        catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        catch (SQLException sqle){
            sqle.printStackTrace();
        }
    } 
}
