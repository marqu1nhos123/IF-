import java.util.Scanner;
public class Questão8 {
    public static void main(String[] args){
        Scanner receber = new Scanner(System.in);
        System.out.println("qual e o seu nome? ");
        String nome = receber.next();
        System.out.println("qual e o seu sobrenome?");
        String sobrenome = receber.next();
        System.out.println("qual e a cidade que o senhor mora?");
        String cidade = receber.next();
        System.out.println("informe-nos qual e o nome da rua onde que o senhor(a) mora:");
        String endereco = receber.next();
        System.out.println("qual e o numero da sua casa, senhor(a) "+ nome + ":");
        int n1 = receber.nextInt();
        System.out.println("qual e o estado que o senhor(a) mora? ");
        String estado = receber.next();
        System.out.println("Nome:"+nome+" "+sobrenome+"\nEndereco:"+endereco+",n "+n1+"-"+cidade+"-"+estado);
    }
}
