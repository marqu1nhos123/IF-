import java.util.Scanner;
public class Questão11 {
    public static void main(String[] args){
        Scanner convercao = new Scanner(System.in);
        System.out.println("informe a quantidade de horas que voce deseja converter: ");
        int hora = convercao.nextInt();
        int minutos = 60*60;
        int total = minutos * hora ;
        System.out.println("As horas informadas convertidas e:"+total);
    }
}
