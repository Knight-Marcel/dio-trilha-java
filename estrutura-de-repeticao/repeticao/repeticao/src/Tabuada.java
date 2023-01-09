import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada, resultado, i=1;

    System.out.println("Digite a tabuada que vocÊ deseja calcular:" );
    tabuada = scan.nextInt();
    
        if(tabuada >0 && tabuada <=10){
            System.out.println("A tabuada de "+tabuada);
        for(i = 1 ; i<=10 ;i++){
            resultado= tabuada * i;

            System.out.println(tabuada+" X "+i+" = "+resultado);

        }
        }
    }
    
}
