import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var read = new Scanner(System.in);

        System.out.println("Informe o tamanho da base: ");
        var base = read.nextDouble();
        System.out.println("Informe o tamnanho da altura: ");
        var altura = read.nextDouble();

        var area = base * altura;

        System.out.printf("A área do retângulo é: %s",area);

        }
    }
