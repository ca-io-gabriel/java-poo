import br.com.count.Count;
import br.com.count.FirstNumberIsGreaterThanLastNumber;
import br.com.bankAccount.BankAccount;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws FirstNumberIsGreaterThanLastNumber {
        while (true) {
            System.out.println("===================================");
            System.out.println("Selecione um dos projetos:");
            System.out.println("1 - Simulador de uma conta bancária");
            System.out.println("2 - Contador");
            System.out.println("3 - Sair");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> createBankAccount();
                case 2 -> createCounter();
                case 3 -> System.exit(0);
            }
        }
    }

    public static void createBankAccount() {
        System.out.println("Digite número da sua conta: ");
        int number = scanner.nextInt();
        System.out.println("Digite o número da sua agência: ");
        String agency = scanner.next();
        System.out.println("Digite o seu nome: ");
        String name = scanner.next();
        System.out.println("Digite o seu saldo: ");
        double balance = scanner.nextDouble();

        new BankAccount(number, agency, name, balance);
    }

    public static void createCounter() throws FirstNumberIsGreaterThanLastNumber {
        int initialNumber;
        int lastNumber;

        while (true) {
            try {
                System.out.println("Digite o número inicial: ");
                initialNumber = scanner.nextInt();
                System.out.println("Digite o último número: ");
                lastNumber = scanner.nextInt();

                new Count(initialNumber, lastNumber).counting();
                break;
            } catch (FirstNumberIsGreaterThanLastNumber ex) {
                System.out.println(ex.getMessage());
                System.out.println("Tente novamente...\n");
            }
        }
    }
}