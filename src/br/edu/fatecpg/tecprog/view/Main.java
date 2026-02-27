package br.edu.fatecpg.tecprog.view;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        double [] valor = new double[5];
        double soma = 0;
        double media = 0;

        for(int i = 0; i < 5; i++){
            System.out.println(String.format("Digite o %dº número: ", i+1));
            valor[i] = scan.nextDouble();
        }
        for (int i = 4; i >= 0 ; i--) {
            soma += valor[i];
        }

        media = soma/5;

        System.out.println(String.format("A média é %f", media));
    }
}