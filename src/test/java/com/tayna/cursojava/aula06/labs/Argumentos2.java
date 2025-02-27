package com.tayna.cursojava.aula06.labs;

public class Argumentos2 {
    public static void main(String[] args){
        if(args.length > 1){
            System.out.println("Olá Mundo!" + args[1]);
        }else{
            System.out.println("Nenhum argumento foi passado.");
        }
    }
}
