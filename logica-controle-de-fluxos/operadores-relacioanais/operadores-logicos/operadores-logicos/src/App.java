public class App {
    public static void main(String[] args) throws Exception {
        float salarioMensal = 1300.00f;
        float mediaSalario = 1000.00f;
        int quantidadeDependentes =5;
        float mediaDependentes =3;
        boolean salarioBaixo;
       

        if((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)){
            System.out.println("Todas as condições são verdadeiras");
        }
        else{
            System.out.println("nem todas as condições são verdadeiras");
        }



    }
}
