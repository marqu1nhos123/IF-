import java.util.Scanner;
public class Questão21 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.err.print("informe um tamanho para um lado do trinagulo:");
        double tamanho1 = numero.nextDouble();
        System.err.print("informe um tamanho para um lado do trinagulo:");
        double tamanho2 = numero.nextDouble();
        System.err.print("informe um tamanho para um lado do trinagulo:");
        double tamanho3 = numero.nextDouble();
        
        if (tamanho1 == tamanho2 && tamanho2 == tamanho3){
            System.err.println("triangulo Equilatero");
        }
        else if(tamanho1 == tamanho2 || tamanho2 == tamanho3 || tamanho3 == tamanho1){
            System.err.println("triangulo Isosceles");
        }
        else{
            System.err.println("triangulo Escaleno");
        }
    }
      
}
