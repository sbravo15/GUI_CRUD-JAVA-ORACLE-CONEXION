/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionSQLDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago
 */
public class DataBaseConnection {
    
       public static  Connection getConnection()
            {
                try
                    {
                        Class.forName("oracle.jdbc.OracleDriver");
               
                        String myDB="jdbc:oracle:thin:@localhost:1521:XE";
                        String usuario = "tablashotel";
                        String password = "1234";
                                
                        Connection cnx = DriverManager.getConnection(myDB,usuario,password);
                        return cnx;
                        
                    }
                catch(SQLException ex)
                        {
                            System.out.println(ex.getMessage());
                            System.out.println("no usbo coneccion");
                        }
                catch (ClassNotFoundException ex) {
                     Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
                      System.out.println("teenrmos erros");
                     }

                    return null;
                
                
            }
}
