

public class Calculo {
    
public static int  getUmaParcela( ){
return 1;
}

public static int  getDuasParcela( ){
    return 2;
    }

public static double getTaxaUma(){
    return 0.020;
}    

public static double getTaxaDuas(){
    return 0.040;
}   
public static double getTaxa(){
    return 0.050;
}   

public static void Total (double valor, int parcela){
    if (parcela == 1){
        
        double result = (valor * getTaxaUma()) + valor;
        System.out.println("O valor do emprestimo pago em uma parcela é: "+result);
    }    
    if (parcela ==2){
        
        double resulti = (valor * getTaxaDuas()) + valor;
        System.out.println("O valor do emprestimo pago em duas parcelas é: "+resulti);
    }

    if(parcela > 2){
        
        double resultid = (valor * getTaxa()) + valor;
        System.out.println("O valor do emprestimo acima de 5 parcelas é: "+resultid);
    }
    
    


}



}
