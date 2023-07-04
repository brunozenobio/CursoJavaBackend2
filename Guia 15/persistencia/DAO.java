/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author brunopc
 */
public class DAO {
    
    protected Connection conexion=null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String user = "root";
    private final String passworld = "Bruno1231";
    private final String database = "tienda";
    private final String driver = "com.mysql.jdbc.Driver";
    
    protected void conectarBase() throws ClassNotFoundException{
        
        try {
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/" + database;
            conexion = DriverManager.getConnection(url,user,passworld);
        } catch (SQLException ex) {
            conexion = null;
            ex.printStackTrace();
            System.out.println("SQLException: " + ex.getMessage()) ;
            System.out.println("SQLSTATE: " + ex.getSQLState());
            System.out.println("VendorError " + ex.getErrorCode());
        }
        
    }
    
    
    protected void desconectarBase() throws Exception{
            try {
                if(resultado != null){
                    resultado.close();
                }
                if(sentencia != null){
                    sentencia.close();
                }
                if(conexion != null){
                    conexion.close();
                }
            } catch (Exception e) {
                throw e;
            }
    }
    protected void instaModificarEliminar(String sql) throws SQLException, ClassNotFoundException, Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }finally{
            desconectarBase();
        }
        
    }
    protected void consultarBase(String sql){
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            
        } catch (Exception e) {
        }
    }
    
    
}
