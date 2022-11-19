/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.skravetz.centromedico.controlador;

import com.skravetz.centromedico.database.Conexion;
import com.skravetz.centromedico.modelo.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastiankravetz
 */
public class Registro {
    
    public List<Paciente> listarPacientes() throws SQLException {
        Conexion connector = new Conexion();
        String query = "SELECT * FROM paciente";     
        PreparedStatement queryStatement = connector.createConnection().prepareStatement(query);
        ResultSet rs = queryStatement.executeQuery();
        
        List<Paciente> listaPacientes = new ArrayList<>();
           
        while(rs.next()) {
            Paciente paciente = new Paciente();
            paciente.setRut(rs.getString("rut"));
            paciente.setNombre(rs.getString("nombre"));
            paciente.setGenero(rs.getString("genero"));
            paciente.setEdad(rs.getInt("edad"));
            paciente.setDireccion(rs.getString("direccion"));
            paciente.setCiudad(rs.getString("ciudad"));
            paciente.setIsapre(rs.getString("isapre"));
            paciente.setDonante(rs.getBoolean("donante"));
            listaPacientes.add(paciente);
        }
        
        queryStatement.close();
        connector.createConnection().close();
        
        return listaPacientes;
    }
    
    public List<Paciente> listarPacientes(String rutBuscar) throws SQLException {
        Conexion connector = new Conexion();
        String query = "SELECT * FROM paciente WHERE rut=?";     
        PreparedStatement queryStatement = connector.createConnection().prepareStatement(query);
        queryStatement.setString(1, rutBuscar);
        ResultSet rs = queryStatement.executeQuery();

        List<Paciente> listaPacientes = new ArrayList<>();

        while(rs.next()) {
            Paciente paciente = new Paciente();
            paciente.setRut(rs.getString("rut"));
            paciente.setNombre(rs.getString("nombre"));
            paciente.setGenero(rs.getString("genero"));
            paciente.setEdad(rs.getInt("edad"));
            paciente.setDireccion(rs.getString("direccion"));
            paciente.setCiudad(rs.getString("ciudad"));
            paciente.setIsapre(rs.getString("isapre"));
            paciente.setDonante(rs.getBoolean("donante"));
            listaPacientes.add(paciente);
        }

        queryStatement.close();
        connector.createConnection().close();

        return listaPacientes;
    }
    
    public boolean agregarPaciente(Paciente paciente) throws SQLException {
        Conexion connector = new Conexion();
        String query = "INSERT INTO paciente (rut,nombre,genero,edad,direccion,ciudad,isapre,donante) VALUES (?,?,?,?,?,?,?,?)";     
        PreparedStatement queryStatement = connector.createConnection().prepareStatement(query);
        queryStatement.setString(1, paciente.getRut());
        queryStatement.setString(2, paciente.getNombre());
        queryStatement.setString(3, paciente.getGenero());
        queryStatement.setInt(4, paciente.getEdad());
        queryStatement.setString(5, paciente.getDireccion());
        queryStatement.setString(6, paciente.getCiudad());
        queryStatement.setString(7, paciente.getIsapre());
        queryStatement.setBoolean(8, paciente.isDonante());
        int updateReturn = queryStatement.executeUpdate();
        
        return updateReturn == 1 ? true : false;
    }
    

}
