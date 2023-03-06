public class Vehicle{

  
    public static void main(String[] args) {
    PetrolEngine pe = new PetrolEngine(); 
    DeselEngine de = new DeselEngine();
       System.out.println("hellow World!"); 
       pe.start(); 
       de.start();
       de.stop();
    }
}
