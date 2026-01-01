import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var read = new Scanner(System.in);

        var anoAtual = OffsetDateTime.now().getYear();

        System.out.printf("Digite o seu nome: ");
        var nome = read.nextLine();
        System.out.printf("Digite o ano de nascimento: ");
        var ano = read.nextInt();

        var idade = anoAtual - ano;

        System.out.printf("Olá %s você tem %s anos.", nome, idade);

        }
    }
