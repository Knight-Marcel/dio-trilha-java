public class SmartTv{
 boolean ligada = false;
 int canal =1;
 int volume= 25;   

public void aumentarVolume(){
    volume++;
    System.out.println("aumentando volume:  " + volume);
}

public void diminuirVolume(){
    volume--;
    System.out.println("diminuindo volume:  " + volume);
}

public void mudarCanal (int novoCanal){
    canal= novoCanal;
}

public void aumentarCanal(){
    canal++;
    System.out.println("aumentando canal:  " + canal);
}

public void diminuirCanal(){
    canal--;
    System.out.println("diminuindo canal:  " + canal);
}

public void ligar (){
    ligada=true ;
}

public void desligar (){ 
    ligada=false ;
}

}