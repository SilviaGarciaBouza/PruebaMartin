/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebamartin.controller;

import com.mycompany.pruebamartin.model.ModelIndex;
import com.mycompany.pruebamartin.view.ViewIndex;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author silvia
 */
public class ControllerIndex implements ActionListener{
    
    private ViewIndex viewIndex;
    private ModelIndex modelIndex;
    

    public ControllerIndex(ViewIndex view, ModelIndex model) {
        this.viewIndex = view;
        this.modelIndex = model;
        this.viewIndex.setEscuchador(this);
    }

    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
