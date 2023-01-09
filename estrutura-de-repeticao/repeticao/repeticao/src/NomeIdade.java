/*Faça um program que leia conjuntos de dois valores, o primerio representando o nome do aluno e o segundo representando a sua idade
(pare inserindo valor 0) 
*/

import java.util.Scanner;


public class NomeIdade {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in); //instanciando a classe scanner
    
    //variaveis
    String nome; 
    int idade;
    int control;
    
    do{
    System.out.println("Digite o nome do aluno: ");
    nome= sc.next();
    if(nome.equals("0") ){
        break;
    }


    System.out.println("Digite a idade do aluno: ");
    idade = sc.nextInt();

    System.out.println("Digite 1 para continuar cadastrando");
    control = sc.nextInt();

    }while (control ==1);
   






    }
}
