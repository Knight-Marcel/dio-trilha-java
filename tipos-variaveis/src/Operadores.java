import javax.lang.model.util.ElementScanner14;

public class Operadores {
    public static void main(String[] args) {
       /*
        int numero = 5;
        numero = - numero;
        System.out.println(-numero);
        System.out.println(numero);

        numero =  numero * -1;
        System.out.println(numero);*/
        /*
        int numero = 5;
        //repetição
        numero = numero + 1; // ++ é a  mesma coisa de numero +1
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel);*/
        
        //operadores ternario
        //utilizando por if else
      /*  int a , b ;
        a= 6;
        b=3;
        String resultado = a==b ? "verdadeiro" : "falso"; //?: "operador ternario pode ser utilizado para outros tipos de dados além de string "
        /*
        if(a==b)
            resultado  = "verdadeiro";
        else
            resultado = "false";

        
        System.out.println(resultado);*/

        boolean condicaoUm = true;
        boolean condicaoDois=true;

        if(condicaoUm && condicaoDois){
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicaoUm || condicaoDois){
            System.out.println("Uma das condições é verdadeira");
        }








    }
}
