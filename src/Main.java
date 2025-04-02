import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        float media;
        String situacao;
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextInt();
        while(nota1 < 0 || nota1 > 10){
            System.out.print("A nota deve ser um número entre 0 e 10, digite novamente: ");
            nota1 = scanner.nextInt();
        }
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextInt();
        while(nota2 < 0 || nota2 > 10){
            System.out.print("A nota deve ser um número entre 0 e 10, digite novamente: ");
            nota2 = scanner.nextInt();
        }
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextInt();
        while(nota3 < 0 || nota3 > 10){
            System.out.print("A nota deve ser um número entre 0 e 10, digite novamente: ");
            nota3 = scanner.nextInt();
        }
        System.out.print("Digite a quarta nota: ");
        nota4 = scanner.nextInt();
        while(nota4 < 0 || nota4 > 10){
            System.out.print("A nota deve ser um número entre 0 e 10, digite novamente: ");
            nota4 = scanner.nextInt();
        }
        media = (nota1 + nota2 + nota3 + nota4)/4;
        if(media >= 6){
            situacao = "APROVADO";
        }else{
            situacao = "REPROVADO";
        }
        System.out.print("A média do aluno é " + media + ", a situação dele é: " + situacao);
    }
}