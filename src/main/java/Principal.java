
import Fabricas.*;
import Formas.Forma;


public class Principal {

 
    public static void main(String[] args) {
       
       AbstractFactory fabAzul = ProdutorDeFabricas.getFactory("BLUE");
       
       Forma forma1 = fabAzul.getCirculo(1);
       forma1.draw();
       
       Forma forma2 = fabAzul.getRetangulo(2);
       forma2.draw();
       
       Forma forma3 = fabAzul.getQuadrado(3);
       forma3.draw();
       
       AbstractFactory fabVermelha = ProdutorDeFabricas.getFactory("RED");
       
       Forma forma4 = fabVermelha.getCirculo(4);
       forma4.draw();
       
       Forma forma5 = fabVermelha.getRetangulo(5);
       forma5.draw();
       
       Forma forma6 = fabVermelha.getQuadrado(6);
       forma6.draw();
    }
    
}
