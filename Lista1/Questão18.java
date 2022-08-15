import java.util.Scanner;
public class Questão18 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        while (true){
        System.out.print("Digite a sua senha:");
        int senha = numero.nextInt();
        if (senha == 1234){
            System.out.print("=-=-=-=-=-=-=-=-=-=-= ACESSO PERMITIDO =-=-=-=-=-=-=-=-=-=-=");
            break;
        }
        else if (senha != 1234){
            System.out.print("=-=-=-=-=-=-=-=-=-=-= ACESSO NEGADO =-=-=-=-=-=-=-=-=-=-=\n");
        }
        }
    }
}
