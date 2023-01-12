public class Area {
    
    public static void campo(double a){
        double quadrado = a * a;
        System.out.println("A area do quadrado é: "+quadrado);
   
    }
    
    public static void campo(double lado1, double lado2){
        double retangulo = lado1 * lado2;
        System.out.println("A area do retangulo é: "+retangulo);
    }
    
    public static void campo(double baseMaior, double baseMenor, double altura){
        double trapezio = ((baseMaior+baseMenor)*altura)/ 2;
        System.out.println("A area do trapezio é: "+trapezio);
        
    }



}
