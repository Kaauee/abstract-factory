/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorFormas;

import Formas.Quadrado;

/**
 *
 * @author G-fire
 */
public class QuadradoVermelho extends Quadrado{

    public QuadradoVermelho(float base) {
        super(base, "Vermelho");
    }

    @Override
    public void draw() {
        System.out.println("Dentro do Quadrado " + getColor() 
                + " de Base " + getBase() + " no método draw()");    
    }
    
}
