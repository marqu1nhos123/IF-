import java.util.Scanner;
public class Questão13 {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        System.out.println("informe o tempo que sera a queda livre:");
        double tempo = numero.nextDouble();
        double somatempo = tempo*60;
        double somatempo2 = somatempo*somatempo;
        double altura = somatempo2 * 20.2;
        double altura2 = somatempo2+altura /2;
        System.out.println("A altura final e "+altura2+" metros");
   }
}
