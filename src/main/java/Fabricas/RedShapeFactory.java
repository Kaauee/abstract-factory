/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import CorFormas.RetanguloVermelho;
import CorFormas.QuadradoVermelho;
import CorFormas.CirculoVermelho;
import Formas.Forma;
/**
 *
 * @author G-fire
 */
public class RedShapeFactory extends AbstractFactory{

    @Override
    public Forma getCirculo(float raio) {
        return new CirculoVermelho(raio);
    }

    @Override
    public Forma getRetangulo(float base) {
        return new RetanguloVermelho(base);    
    }

    @Override
    public Forma getQuadrado(float base) {
        return new QuadradoVermelho(base);       
    }
    
}
