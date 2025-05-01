/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pruebamartin.view;

import com.mycompany.pruebamartin.controller.ControllerPruebaMArtin;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author silvia
 */
public class ViewMartin extends javax.swing.JFrame {

    //Panels
    JPanel titlePanel;
    JPanel buttonPanel;
    
    //Elements
    JLabel titleLabel;
    JButton indexButton;
   
    public ViewMartin() {
        //Configuration
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        setTitle("Prueba MArtin");
        
        //Tittle Panel
        titlePanel= new JPanel(new FlowLayout());
        titleLabel= new JLabel("Martin");
        titlePanel.add(titleLabel);
        add(titlePanel);
        
        //Button PAnel
        buttonPanel= new JPanel(new FlowLayout());
        indexButton = new JButton("Index");
        indexButton.setActionCommand("index");
        indexButton.setSize(200, 50);
        buttonPanel.add(indexButton);
        add(buttonPanel);
        
        //Configuration
        setSize(400,600);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);      
    }
    
    public void setActionListener(ControllerPruebaMArtin controller){
        indexButton.addActionListener(controller);
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
