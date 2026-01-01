import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Escreva um código onde o usuário informa um número inicial, posteriormente irá informar
        *  outros N números, a execução do código irá continuar até que o número informado dividido
        *  pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro
        *  número devem ser ignorados*/
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        var number = scanner.nextInt();
        var keepVerify = true;
        while (keepVerify) {
            System.out.println("Informe o número para verificação");
            var toVerify = scanner.nextInt();
            if (toVerify < number){
                System.out.printf("Informe um número maior que %s\n",number);
                continue;
            }
            var result = toVerify % number;
            keepVerify = result == 0;
            System.out.printf("%s %% %s = %s\n",toVerify,number,result);

        }
    }
}