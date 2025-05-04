/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebamartin.controller;

import com.mycompany.pruebamartin.model.ModelIndex;
import com.mycompany.pruebamartin.model.ModelPruebaMartin;
import com.mycompany.pruebamartin.view.ViewIndex;
import com.mycompany.pruebamartin.view.ViewMartin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author silvia
 */
public class ControllerPruebaMArtin implements ActionListener{
    
    ViewMartin view;
    ModelPruebaMartin model;
   

    public ControllerPruebaMArtin(ViewMartin view,ModelPruebaMartin model) {
        this.view= view;
        this.model= model;
        this.view.setActionListener(this);
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String comand = e.getActionCommand();
        switch(comand){
            case "index" -> {
            view.dispose();
             ViewIndex viewIndex;
             ModelIndex modelIndex;
            ControllerIndex controller = new ControllerIndex();
            }
        }
    }
    
}
