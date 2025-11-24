/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventascheckstyle.Modelo;

/**
 *
 * @author BryanG
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/local_ropa";
    private static final String USER = "admin";
    private static final String PASSWORD = "Dawa2024";
    
    public static Connection getConnection(){
        Connection conn = null;
        try{   
            conn = DriverManager.getConnection(URL,USER, PASSWORD);
            System.out.println("Conexion a la base exitosa");
        
        }catch(SQLException e){
            System.out.println("Error de conexion -> " + e.getMessage());
        }
        return conn;
    }
}