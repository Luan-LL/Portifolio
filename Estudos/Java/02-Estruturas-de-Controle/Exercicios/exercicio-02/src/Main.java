import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Escreva um código onde o usuário entra com sua altura e peso,
         seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

        Se for menor ou igual a 18,5 "Abaixo do peso";
        se for entre 18,6 e 24,9 "Peso ideal";
        Se for entre 25,0 e 29,9 "Levemente acima do peso";
        Se for entre 30,0 e 34,9 "Obesidade Grau I";
        Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
        Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
        */

        var scanner = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        var altura = scanner.nextDouble();
        System.out.println("Digite sua peso: ");
        var peso = scanner.nextDouble();

        var imc = peso/(altura*altura);

        if (imc < 18.5) {
            System.out.printf("%.2f\n Abaixo do peso",imc);
        }else if (imc >= 18.5 && imc < 25) {
            System.out.printf("%.2f\n Peso ideal",imc);
        } else if (imc <= 25 && imc < 30) {
            System.out.printf("%.2f\n Levemente acima do peso",imc);
        }else if (imc <= 30 && imc < 35) {
            System.out.printf("%.2f\n Obesidade Grau I",imc);
        }else if (imc <= 35 && imc < 40) {
            System.out.printf("%.2f\n Obesidade Grau II (Severa)",imc);
        }else if (imc >= 40) {
            System.out.printf("%.2f\n Obesidade Grau III (Mórbida)\n",imc);
        }
    }
}