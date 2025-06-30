package br.com.count;

public class Count  {
    private final int initialNumber;
    private final int lastNumber;

    public Count(int initialNumber, int lastNumber) {
        this.initialNumber = initialNumber;
        this.lastNumber = lastNumber;
    }

    public void counting() throws FirstNumberIsGreaterThanLastNumber {
        if (initialNumber >= lastNumber) {
            throw new FirstNumberIsGreaterThanLastNumber();
        }

        for (int i = initialNumber; i <= lastNumber; i++) {
            System.out.printf("Contador: %s \n", i);
        }
    }
}
