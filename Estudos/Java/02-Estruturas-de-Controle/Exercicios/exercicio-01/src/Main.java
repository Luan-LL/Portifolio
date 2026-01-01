import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;*/

        var scanner = new Scanner(System.in);
        System.out.println("Informe a tabuada desejada: ");
        var tabuada = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            var result = i * tabuada;
            System.out.printf("%s x " + i + " = %s\n",tabuada,result);
        }
    }
}