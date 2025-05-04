/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebamartin;

import com.mycompany.pruebamartin.controller.ControllerPruebaMArtin;
import com.mycompany.pruebamartin.model.ModelPruebaMartin;
import com.mycompany.pruebamartin.view.ViewMartin;

/**
 *
 * @author silvia
 */
public class MainPruebaMartin {

    public static void main(String[] args) {
        ViewMartin view = new ViewMartin();
        ModelPruebaMartin model = new ModelPruebaMartin();
        ControllerPruebaMArtin controller = new ControllerPruebaMArtin(view, model);
    }
}
