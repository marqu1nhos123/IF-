import java.util.Scanner;
public class Questão7 {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        System.out.println("Qual e a distancia que voce percorreu: ");
        float distancia = numero.nextFloat();
        System.out.println("qual tempo voce gastou para percorer "+ distancia +" KM");
        float hora = numero.nextFloat();
        float km = (distancia / hora);
        System.out.println("voce estava percorendo "+ km +" km/h");
    }
}
