import java.util.Scanner;
public class Questão15 {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        System.out.print("Informe a sua altura em metros:");
        double altura = numero.nextDouble();
        System.out.print("informe o seu peso em kg:");
        double peso = numero.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        if (imc < 18.5){
            System.out.println("Magreza");
        }
        else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Saudavel");
        }
        else if (imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }
        else if (imc >= 30 && imc <=34.9){
            System.out.println("Obesidade Grau 1");
        }
        else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade Grau 2 (severa)");    
        }
        else if (imc >= 40){
            System.out.println("Obesidade Grau 3 (morbida)");
        }
    }
    
        
    
}
