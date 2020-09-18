import entidades.Persona;
import bought.Compra;

/**
 * main
 */
public class Main {

    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Compra p3 = new Compra();
        
       
       
        p1.setName("Alexandra");
        p1.laugh();

        p3.setProduct1("$");
        System.out.println("Total gastado "+ p3.getProduct1());
        p3.laugh();

        p1.setSex("Pizza 2 U");
        System.out.println("Producto Comprado = "+ p1.getSex() );
        
        
        p2.setName("Saul");
        p2.laugh();

        p3.setProduct1("$");
        System.out.println("Total gastado "+ p3.getProduct1());
        p3.laugh();

        p1.setSex("Pizza Extra Grande 1 U");
        System.out.println("Producto Comprado = "+ p1.getSex() );
    }
}