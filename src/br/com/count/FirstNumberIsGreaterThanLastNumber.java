package br.com.count;

public class FirstNumberIsGreaterThanLastNumber extends RuntimeException {
    public FirstNumberIsGreaterThanLastNumber() {
        super("O primeiro número deve ser menor que o primeiro");
    }
}
