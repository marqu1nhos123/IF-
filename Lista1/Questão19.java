import java.util.Scanner;
public class Questão19 {
    public static void main(String[] args) {
        System.err.print("=-=-=-=-=-=-=-=-=-=-=-=VALORES=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.err.println("O valor da unidade da laranja e 50 contavos\nJa voce comprando mais de uma duzia o preco fica de 30 centavos");
        Scanner numero = new Scanner(System.in);
        System.err.print("informe a quantidade de laranjas que vc deseja comprar:");
        double laranjas = numero.nextDouble();
        
        if (laranjas <= 11){
            double valor = (laranjas*0.50);
            System.err.print(String.format("Voce devera que pagar: %.1f",valor ));
        }
        if (laranjas >= 12){
            double valor2 = (laranjas *0.30);
            System.err.print(String.format("O valor total da sua compra e:%.1f",valor2));
        }
    }
    
}
