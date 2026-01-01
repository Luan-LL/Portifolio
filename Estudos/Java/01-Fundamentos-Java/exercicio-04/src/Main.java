import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var read = new Scanner(System.in);

        System.out.println("Informe o nome da primeira pessoa:");
        var name = read.next();

        System.out.printf("Informe a idade de %s:\n ", name);
        var age = read.nextInt();

        System.out.println("Informe o nome da segunda pessoa: ");
        var name2 = read.next();

        System.out.printf("Informe a idade de %s:\n ", name2);
        var age2 = read.nextInt();

        var result = age - age2;

        if (result < 0){
            result *= -1;
        }
        System.out.printf("A diferença de idade entre %s e %s é de %s",name,name2, result);
    }
}