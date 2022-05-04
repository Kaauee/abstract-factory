/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

/**
 *
 * @author G-fire
 */
public class ProdutorDeFabricas {
    
    public static AbstractFactory getFactory(String cor){
    if (cor.equalsIgnoreCase("BLUE")){
        return new BlueShapeFactory();
    }else {
        if (cor.equalsIgnoreCase("RED")){
         return new RedShapeFactory();
        }
    }
    return null;
    }
    
}
