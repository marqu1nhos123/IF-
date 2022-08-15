package com.mycompany.lista1;
import java.util.Scanner;
public class Questão1 {
    public static void main(String[] args){
    System.out.println("Informe um numero que deseja calcular: ");
    Scanner rep = new Scanner(System.in);
    double numero1 = rep.nextDouble();
    System.out.println("Informe um outro numero que deseja calcular: ");
    double numero2 = rep.nextDouble();
    double soma = (numero1 + numero2);
    System.out.println("A soma dos numeros digitados e:" + soma);
    
    
    
}
}