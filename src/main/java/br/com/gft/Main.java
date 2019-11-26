package br.com.gft;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Qual é seu altura: ");
        double altura = scanner.nextDouble();

        String res = pegaFaixa(calcularIMC(peso, altura));
        System.out.println("Resultado: " + res);

    }

    public static double calcularIMC(double peso, double altura) {

        return peso / Math.pow(altura, 2);
    }

    public static String pegaFaixa(double imc){

        if(imc < 20){
            return "Você ta magro para caramba, vai comer!";
        }else if(imc >= 20 && imc <= 24 ){
            return "Você esta em boa forma, pode ir pro MC Donalds";
        }else if(imc >= 30 && imc <= 34 ){
            return "Você esta gordinho, vá para academia o mais rapido possivel!";
        }else if(imc > 34){
            return "Você esta muito gordinho, procure um médico!";
        }

        return "Erro ao tentar retorna o tipo de imc!";
    }
}
