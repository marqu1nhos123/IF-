import java.util.Scanner;
public class Questão10 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("qual e a quantidade de minutos que voce deseja converter?");
        int minutos = x.nextInt();
        int hora = minutos /60;
        System.out.println("A quantidade de minutos convertido e:"+hora+" horas");
    }
}
