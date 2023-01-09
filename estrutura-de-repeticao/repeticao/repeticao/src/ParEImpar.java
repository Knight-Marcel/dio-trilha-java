import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtd, i=0;
        int numero=0, par=0, impar=0;
        System.out.println("Digite a quantidade de numeros a serem calculado");
        qtd = scan.nextInt();
        do{
            System.out.println("Digite o numero: ");
            numero = scan.nextInt();
            i++;

            if(numero % 2 == 0){
              par++;
            }else{
             impar++;
            }

            System.out.println("Quantidade de numeros pares: "+par);
            System.out.println("Quantidade de numeros impar: "+impar);

        }while(i<qtd);


    }
}
