/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.skravetz.centromedico.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sebastiankravetz
 */
public class Conexion {
    
    public Connection createConnection() {

        Connection cnx = null;
        
        try{
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/consultaMedica",
                    "root", "");
            System.out.println("Conexión establecida a la base de datos.");
        }catch(SQLException e) {
            System.out.println("Error al conectar a la base de datos "+e.getMessage() );
        }
        
        return cnx;
    }
    
}
