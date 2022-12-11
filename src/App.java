import java.util.Scanner;

public class App {
    int num_digitado;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor, digite qualquer número que seja inteiro:");
        int num_digitado = leitor.nextInt();
        leitor.close();
        System.out.println(" O número que você digitou tem " + tantosnumeros(num_digitado) + " algarismos ");

    }
    public static int tantosnumeros(int a) {
        String algarismos = Integer.toString(a);
        return algarismos.length();
    }
}