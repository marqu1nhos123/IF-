import java.util.Scanner;
public class Questão4 {
    public static void main(String[] args){
        Scanner nota = new Scanner(System.in);
        System.out.println("informe as notas dos alunos: ");
        float nota1 = nota.nextFloat();
        System.out.println("informe as notas dos alunos: ");
        float nota2 = nota.nextFloat();
        System.out.println("informe as notas dos alunos: ");
        float nota3 = nota.nextFloat();
        System.out.println("informe as notas dos alunos: ");
        float nota4 = nota.nextFloat();
        
        double media = (nota1 + nota2 + nota3 + nota4)/ 4;
        System.out.println("a media das notas do aluno: "+ media);
        
    }
}
