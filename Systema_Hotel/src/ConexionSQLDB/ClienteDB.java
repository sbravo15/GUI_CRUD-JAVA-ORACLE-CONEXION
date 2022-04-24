/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionSQLDB;

import Clases.principales.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;

/**
 *
 * @author Santiago
 */
public class ClienteDB {
    //Codigo para el listado en la base de datos 
    public ArrayList<Cliente>  ListaCliente(){
    ArrayList<Cliente> clientes=new ArrayList();   
    
    
    try
                           {
                               //llamamos conexcion
                               Connection cnx = DataBaseConnection.getConnection();
                               //PREPARA EL ESPACION
                               Statement  st = cnx.createStatement();
                               //BOTA EN TABLA O RESULTADOS
                               ResultSet rs = st.executeQuery("SELECT ID_CLIENTE,PRIMER_NOMBRE,APELLIDO,EMAIL,NUM_TELEFONO,ID_RESERVACION " 
                                       +"  FROM CLIENTE ORDER BY 2 ");
                      
                            //   jdbc:oracle:thin:@localhost:1521:XE 
                               while(rs.next())
                                    {
                                        Cliente cl =new Cliente();
                                        cl.setID_CLIENTE(rs.getInt("ID_CLIENTE"));
                                        cl.setPRIMER_NOMBRE(rs.getString("PRIMER_NOMBRE"));
                                        cl.setAPELLIDO(rs.getString("APELLIDO"));
                                        cl.setEMAIL(rs.getString("EMAIL"));
                                        cl.setNUM_TELEFONO(rs.getString("NUM_TELEFONO"));
                                        cl.setID_RESERVACION(rs.getInt("ID_RESERVACION"));
                                        clientes.add(cl);
                                    
                                    }
                               
                               
                            }//fin del TRY
                        catch(SQLException ex)
                            {
                                System.out.println(ex.getMessage());
                                System.out.println("Error en Listado");
                            }//fin del CATCH
                          return clientes;
        }
            // Codigo para insertar datos
    public void insertarClientes(Cliente clientes){
        try{
                Connection cnx = DataBaseConnection.getConnection();
                PreparedStatement pst = cnx.prepareStatement("Insert INTO CLIENTE(ID_CLIENTE,PRIMER_NOMBRE,APELLIDO,EMAIL,NUM_TELEFONO,ID_RESERVACION)"
                +" VALUES(?,?,?,?,?,?)");
                pst.setInt(1,clientes.getID_CLIENTE());
                pst.setString(2,clientes.getPRIMER_NOMBRE());
                pst.setString(3,clientes.getAPELLIDO());
                pst.setString(4,clientes.getEMAIL());
                pst.setString(5,clientes.getNUM_TELEFONO());
                pst.setInt(6,clientes.getID_RESERVACION());
                pst.executeUpdate();
            
            } catch(SQLException ex){
                                System.out.println(ex.getMessage());
                                System.out.println("Error en Listado");
            }//fin del CATCH
                         
        }
}
   
