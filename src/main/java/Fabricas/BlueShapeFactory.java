/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import CorFormas.RetanguloAzul;
import CorFormas.QuadradoAzul;
import CorFormas.CirculoAzul;
import Formas.Forma;
/**
 *
 * @author G-fire
 */
public class BlueShapeFactory extends AbstractFactory{

    @Override
    public Forma getCirculo(float raio) {
        return new CirculoAzul(raio);
    }

    @Override
    public Forma getRetangulo(float base) {
        return new RetanguloAzul(base);    
    }

    @Override
    public Forma getQuadrado(float base) {
        return new QuadradoAzul(base);       
    }
    
}
