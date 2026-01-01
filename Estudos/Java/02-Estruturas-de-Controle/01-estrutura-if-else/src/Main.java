import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        var name = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if (age >= 18 || (age >= 16 && isEmancipated)) {
            System.out.println("Bem vindo!");
            System.out.printf("%s, você pode dirigir\n", name);
        } else{
            System.out.printf("%s, você não pode dirigir.\n",name);
        }
        System.out.println("Fim da execução");

        }
    }
