/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;


public abstract class Retangulo extends Forma{
    
    private float base;

    public Retangulo(float base, String color) {
        super(color);
        this.base = base;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
    
    
    
}
