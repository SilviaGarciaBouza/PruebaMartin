/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pruebamartin.view;

import com.mycompany.pruebamartin.controller.ControllerIndex;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author silvia
 */
public class ViewIndex extends javax.swing.JFrame {

    private JButton botonSuperior;
    private JButton botonInferior;
    private JPanel panelIndex;
    
    public ViewIndex() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("INDEX");
        
        //Creamos un panel en el que vamos a meter los botones
        panelIndex = new JPanel();
        panelIndex.setLayout(new BorderLayout());
        
        //Creamos los botones y los añadimos al panel
        botonSuperior = new JButton("Pantalla 1");
        botonInferior = new JButton("Pantalla 2");
        botonSuperior.setActionCommand("pantalla_1");
        botonInferior.setActionCommand("Pantalla_2");
        botonSuperior.setSize(100, 50);
        botonInferior.setSize(100, 50);
        panelIndex.add(botonSuperior, BorderLayout.NORTH);
        panelIndex.add(botonInferior, BorderLayout.SOUTH);
        
        //Añadimos el panel al JFrame
        this.add(panelIndex); 
        
        //Configuracion JFrame
        setSize(400,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    
    //Necesitamos añadir un "escuchador" a los botones
    public void setEscuchador (ControllerIndex controller) {
        botonSuperior.addActionListener(controller);
        botonInferior.addActionListener(controller);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
