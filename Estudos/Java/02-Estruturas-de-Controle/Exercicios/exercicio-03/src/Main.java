import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Escreva um código que o usuário entre com um primeiro número,
         um segundo número maior que o primeiro e escolhe entre a opção par e impar,
         com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
         no intervalo de números informados,incluindo os números informados e em ordem decrescente;*/

        var scanner = new Scanner(System.in);
        var num1= 0;
        var num2= 0;
        do {
            System.out.println("Digite o primeiro número: ");
            num1 = scanner.nextInt();
            System.out.println("Digite o segundo número (Deve ser maior que o primeiro): ");
            num2 = scanner.nextInt();
            if (num1 >= num2) {
                System.out.println("O segundo número deve ser maior que o primeiro!\n");
            }
        }while (num1 >= num2);

        System.out.println("Escolha par ou impar: ");
        var escolha = scanner.next();

        if(escolha.equalsIgnoreCase("par\n")) {
            for (int i = num2; i >= num1; i--) {
                if(i % 2 == 0) {
                    System.out.println(i + " ");
                }
            }

        } else if (escolha.equalsIgnoreCase("impar\n")){
            for (int i = num2; i >= num1; i--) {
                if(i % 2 != 0) {
                    System.out.println(i + " ");
                }
            }
        }else{
            System.out.println("Opção inválida");
        }
    }
}