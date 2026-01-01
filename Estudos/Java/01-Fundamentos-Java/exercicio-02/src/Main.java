import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    var read = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado: ");
        var ladoQuadrado = read.nextDouble();

        var areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.printf("O tamanho da área é de: %s",areaQuadrado);

    }
}