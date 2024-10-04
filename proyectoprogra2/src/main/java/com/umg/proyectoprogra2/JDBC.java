/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyectoprogra2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristobal Barrios
 */
public class JDBC {
    private String urlBd = "jdbc:oracle:thin:@localhost:1521/xepdb1";
    private String usuarioBd = "PROYECTO";
    private String passwordBd = "proyecto";
    
    public JDBC() {
    }
    
    public void ejecutarSelect(String sentencia){
        try {
            
            // Registra/carga el driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Crea una nueva conexión con la configuración de las variables de la clase (url, usuario, passowrd)
            Connection con = DriverManager.getConnection(this.urlBd, this.usuarioBd, this.passwordBd);

            // Ejecuta la sentencia
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sentencia);
            
            // Imprime los resultados
            if (!rs.isBeforeFirst()) {
                System.out.println("No data");
            }

            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) {
                        System.out.print(" | ");
                    }
                    System.out.print(rs.getString(i));
                }
                System.out.println("");
            }

            // Cierra la conexión y devuelve el resultado
            con.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    };
};
