
package Formas;

public abstract class Circulo extends Forma {
    
    private float raio;

    public Circulo(float raio, String color) {
        super(color);
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    
    
}
