import java.util.Scanner;
public class Questão17{
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Informe a sua data de nascimento: ");
        int data = numero.nextInt();
        int subtracao = (2022 - data);
        if (subtracao < 16){
            System.out.print("voce ainda nao tem idade para votar!");
        }
        if (subtracao >= 16){
            System.out.print("voce podera votar esse ano!");
        }
    }
}