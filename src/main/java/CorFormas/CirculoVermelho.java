/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorFormas;

import Formas.Circulo;


/**
 *
 * @author G-fire
 */
public class CirculoVermelho extends Circulo{

    public CirculoVermelho(float raio) {
        super(raio, "Vermelho");
    }



    @Override
    public void draw() {
        System.out.println("Dentro do Circulo " + getColor() 
                + " de Base " + getRaio() + " no método draw()");    
    }
    
}
