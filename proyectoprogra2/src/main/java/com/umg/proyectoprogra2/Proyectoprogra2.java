/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.umg.proyectoprogra2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Cristobal Barrios
 */
public class Proyectoprogra2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        JDBC db = new JDBC();
        db.ejecutarSelect("SELECT * FROM PROYECTO.TBLUSUARIOS");

        System.out.println("Hello World 2!");

        InicioDeSesion inicio = new InicioDeSesion();
        inicio.setVisible(true);
    }
}
