
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ExemploList {
    public static void main(String[] args) {
        //dada uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6], faça

        //criando o array list e usando o método add
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());
        
        //como encontrar o índice de determinado número no arraylist método indexof
        System.out.println("Exiba a posição da nota 5.0-> " + notas.indexOf(5d));

        //Adicionar na lista a nota 8.0 na posição 4
        notas.add(4, 8.0);
        System.out.println(notas.toString());

        //Subustituir a nota 5.0 pela nota 6.0
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas.toString());

        //Conferir se a nota 5.0 esta na lista
        System.out.println("Conferir se a nota 5.0 esta na lista"+ notas.contains(5d));

        //exibir todas as notas na ordem que foi informado
        for (Double nota : notas)System.out.println(nota);

        //exiba a terceira nota adicionada

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        //econtre o menor valor

        System.out.println("Exiba o menor valor do array: " + Collections.min(notas));

        //encotre o maior valor
        System.out.println("Exiba o menor valor do array: " + Collections.max(notas));

        //exibir a soam dos valores

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma +=next;
        }
        System.out.println("A soma é: " + soma);

        //Exiba a media das notas

        System.out.println("A medias das notas é " + (soma/notas.size()));

        //remova a nota zero
        notas.remove(0d);
        System.out.println(notas.toString());

        
        //remava a nota na posição zero
        notas.remove(0);
        System.out.println(notas.toString());

        //Remova as notas menores que 7 e exiba a lista
       
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7 ) iterator1.remove();
        }
        System.out.println(notas);

        //apague toda a lista
        notas.clear();
        System.out.println(notas.toString());
        











     







    }






}
