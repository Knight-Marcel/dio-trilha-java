/*
 Faça um programa que leia 5 números 
 e informe o maior número
 e a media desses números
 */


import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int media, numeros, a =1, total=0, maiornumero =0, aux;

        for(a=1 ; a<=5; a++)
        {
            System.out.println("Digite o numero "+ a);
            numeros= scan.nextInt();
            total += numeros;
            
            if(maiornumero < numeros)
            {
                maiornumero=numeros;
            }
        }

        media = total/5;
        System.out.println("a media é:  " +media);
        System.out.println("O maior número é  "+maiornumero);

    }
}
