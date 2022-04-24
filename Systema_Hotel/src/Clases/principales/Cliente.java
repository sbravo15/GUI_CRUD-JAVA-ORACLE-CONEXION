/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.principales;

/**
 *
 * @author Santiago
 */
public class Cliente {
    private int ID_CLIENTE; 
    private String PRIMER_NOMBRE;
    private String APELLIDO;
    private String EMAIL;
    private String NUM_TELEFONO;
    private int ID_RESERVACION; 

    public Cliente(){
        
    }
    
    public Cliente(int ID_CLIENTE, String PRIMER_NOMBRE, String APELLIDO, String EMAIL, String NUM_TELEFONO, int ID_RESERACIONES) {
        this.ID_CLIENTE = ID_CLIENTE;
        this.PRIMER_NOMBRE = PRIMER_NOMBRE;
        this.APELLIDO = APELLIDO;
        this.EMAIL = EMAIL;
        this.NUM_TELEFONO = NUM_TELEFONO;
        this.ID_RESERVACION = ID_RESERACIONES;
    }

    /**
     * @return the ID_CLIENTE
     */
    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    /**
     * @param ID_CLIENTE the ID_CLIENTE to set
     */
    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    /**
     * @return the PRIMER_NOMBRE
     */
    public String getPRIMER_NOMBRE() {
        return PRIMER_NOMBRE;
    }

    /**
     * @param PRIMER_NOMBRE the PRIMER_NOMBRE to set
     */
    public void setPRIMER_NOMBRE(String PRIMER_NOMBRE) {
        this.PRIMER_NOMBRE = PRIMER_NOMBRE;
    }

    /**
     * @return the APELLIDO
     */
    public String getAPELLIDO() {
        return APELLIDO;
    }

    /**
     * @param APELLIDO the APELLIDO to set
     */
    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    /**
     * @return the EMAIL
     */
    public String getEMAIL() {
        return EMAIL;
    }

    /**
     * @param EMAIL the EMAIL to set
     */
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    /**
     * @return the NUM_TELEFONO
     */
    public String getNUM_TELEFONO() {
        return NUM_TELEFONO;
    }

    /**
     * @param NUM_TELEFONO the NUM_TELEFONO to set
     */
    public void setNUM_TELEFONO(String NUM_TELEFONO) {
        this.NUM_TELEFONO = NUM_TELEFONO;
    }

    /**
     * @return the ID_RESERVACION
     */
    public int getID_RESERVACION() {
        return ID_RESERVACION;
    }

    /**
     * @param ID_RESERVACION the ID_RESERVACION to set
     */
    public void setID_RESERVACION(int ID_RESERVACION) {
        this.ID_RESERVACION = ID_RESERVACION;
    }
    
    
}
