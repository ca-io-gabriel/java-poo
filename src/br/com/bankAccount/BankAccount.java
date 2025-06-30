package br.com.bankAccount;

public class BankAccount {
    private int number;
    private String agency;
    private String name;
    private double balance;

    public BankAccount(int number, String agency, String name, double balance) {
        this.number = number;
        this.agency = agency;
        this.name = name;
        this.balance = balance;

        System.out.printf(("Olá %s, obrigado por criar uma conta em nosso banco," +
                " sua agência é %s, conta %s e seu saldo de %s" +
                " já está disponível para saque"), this.name, this.agency, this.number, this.balance);
        System.out.println(" ");
    }
}
