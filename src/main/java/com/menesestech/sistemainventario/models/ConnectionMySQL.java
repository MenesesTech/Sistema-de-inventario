package com.menesestech.sistemainventario.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionMySQL {

    String database = "inventorybd";
    String user = "root";
    String password = "1234";
    String url = "jdbc:mysql://localhost:3306/" + database;

    Connection conn = null;

    public Connection getConnection() {
        try {
            // Cargar y registar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexion
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error SQLExcepetion: " + e.getMessage());
        }
        return conn;
    }
}
