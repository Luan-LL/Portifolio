import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (var i = 0;i<=100;i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}