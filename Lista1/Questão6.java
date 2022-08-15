import java.util.Scanner;
public class Questão6 {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        System.out.println("informe um valor que voce deseja converter: ");
        double metros = numero.nextDouble();
        double polegada = 39.3700787;
        double convercao = metros * polegada;
        System.out.println (metros +" metros = "+Math.ceil(convercao)+" polegadas");
}
}