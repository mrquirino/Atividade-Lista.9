import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner e = new Scanner(System.in);

        double c, f;

        System.out.println("Digite a temperatura em Fahrenheit: ");
        f = e.nextDouble();
        c = 5 * ((f-32)/9);

        System.out.println("A temperatura em Celsius e: " + c);

    }
}
