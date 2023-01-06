public class App {
    public static void main(String[] args) throws Exception {
            //variaveis
            int i1=10; int i2 = 20; 
            float f1 =4.5f; float f2 = 3.5f;
            char c1='x' ; char c2 = 'y';
            String s1 ="Fulano"; String  s2="Fulano";
            boolean b1=true ; boolean b2= false;
            
            //exercício (i1 == i2 ; i1 != i2 , i1 > i2, i1<= i2)
            if (i1 == i2){
                System.out.println("os valores das variaveris são iguais");
            }
            else{
                System.out.println("os valores das variaveis são diferentes");
            }

            if (i1 != i2){
                System.out.println("Existe diferença entre as variaveis");
            }
            else{
                System.out.println("Não existe diferença entre as variaveis");
            }

            if (i1 > i2){
                System.out.println("A variaveis i1 é maior que i2");
            }
            else{
                System.out.println("A variaveis i2 é maior que i1");
            }

            if (i1 <= i2){
                System.out.println("A variaveis i1 é menor ou igual a 12");
            }
            else{
                System.out.println("A variaveis i1 é maior que i2");
            }
            //exercício usando float f1 == f2 , f1 != f2 , f1 >= f2 , f1< f2
            System.out.println("-----------------------Float----------------------");
            if (f1 == f2){
                System.out.println("os valores das variaveris float são iguais");
            }
            else{
                System.out.println("os valores das variaveis float são diferentes");
            }

            if (f1 != f2){
                System.out.println("Existe diferença entre as variaveis float ");
            }
            else{
                System.out.println("Não existe diferença entre as variaveis float ");
            }

            if (f1 < f2){
                System.out.println("A variaveis f1 é maior que f2");
            }
            else{
                System.out.println("A variaveis f2 é menor que f1");
            }

            if (f1 >= f2){
                System.out.println("A variaveis f1 é maior ou igual a f2");
            }
            else{
                System.out.println("A variaveis f2 é menor que f1");
            }

            System.out.println("-----------------------char----------------------");
            if (c1 == c2){
                System.out.println("As variaveris são iguais");
            }
            else{
                System.out.println("As variaveris não são iguais");
            }

            if (c1 != c2){
                System.out.println("Variaveis são diferentes ");
            }
            else{
                System.out.println("variaveis são iguais ");
            }

            if (c1 > c2){
                System.out.println("A variaveis c1 não é maior que c2");
            }
            else if(c1>c2){
                System.out.println("A variaveis c2 é menor que c1");
            }
            else{
                System.out.println("as variaveis tem o mesmo tamanho");
            }

            if (c1 <= f2){
                System.out.println("A variaveis c1 é maior ou igual a c2");
            }
            else{
                System.out.println("A variaveis c2 é menor que c1");
            }


            //exercício usando float f1 == f2 , f1 != f2 , f1 >= f2 , f1< f2
            System.out.println("-----------------------String----------------------");
            if (s1 == s2){
                System.out.println("A variaveris float são iguais");
            }
            else{
                System.out.println("AS variaveis são diferentes");
            }

            if (s1 != s2){
                System.out.println("Existe diferença entre as variaveis  ");
            }
            else{
                System.out.println("Não existe diferença entre as variaveis  ");
            }

            System.out.println("-----------------------boolean----------------------");
            if (b1 == b2){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }

            if (b1 != b2){
                System.out.println("true  ");
            }
            else{
                System.out.println("false");
            }

            System.out.println("-----------------------int com float----------------------");
            if (i2 > f1){
                System.out.println("I2 é maior que F1");
            }
            else{
                System.out.println("I2 é menor que F1");
            }

           

           


            









    }
}
