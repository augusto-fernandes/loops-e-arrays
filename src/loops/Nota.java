package loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Nota {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int nota;

        System.out.println("Digite uma nota entre zero a dez : ");
        nota = sc.nextInt();

        while (nota <0 || nota  >10){
            System.out.println("Nota invalida Digite novamente: " );
            nota = sc.nextInt();

        }
        System.out.println("A nota do aluno é " + nota);
    }
}
