import java.util.Locale;
import java.util.Scanner;


public class ContaBancaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Olá digite sua agencia");
        String agencia = scanner.next();

        System.out.println("agora, digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("digite seu numero");
        int numero = scanner.nextInt();

        double saldo = 15;


        System.out.println("Olá " + nomeCliente + " seja bem vindo");
        System.out.println("sua agencia é " + agencia );
        System.out.println("o numero de sua conta é " + numero);
        System.out.println("e seu saldo é de " + saldo + " milhões de euros");

    }
}
