public class Main {
    public static void main(String[] args) {
        //métodos de calculadora
        System.out.println("Calculadora");
        Operacoes.Somar(2,2);
        Operacoes.Multiplicacao(3,3);
        Operacoes.Dividir(4,4);
        Operacoes.Subtracao(100,10);

        //Hora
        System.out.println("Mensagem de saudação baseado na hora do dia");
        Hora.Message(9);
        Hora.Message(13);
        Hora.Message(21);

        //Emprestimo
        System.out.println("Valor Final de Um Emprestimo");
        Calculo.Total(2000, Calculo.getUmaParcela());
        Calculo.Total(2000, Calculo.getDuasParcela());
        Calculo.Total(2000, 5);






    }
}
