package Fabricas;

import Formas.*;

public abstract class AbstractFactory {
  
    public abstract Forma getCirculo(float raio);
    public abstract Forma getRetangulo(float base);
    public abstract Forma getQuadrado(float base);
}
