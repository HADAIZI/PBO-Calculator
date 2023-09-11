package id.its.pbo;

public class Calculator {
    
    // Method untuk penambahan
    public int add(int operand1, int operand2) {
        return operand1 + operand2;
    }

    // Method untuk pengurangan
    public int subtract(int operand1, int operand2) {
        return operand1 - operand2;
    }

    // Method untuk perkalian
    public int multiply(int operand1, int operand2) {
        return operand1 * operand2;
    }

    // Method untuk pembagian
    public double divide(int operand1, int operand2) {
        if (operand2 == 0) {
            throw new ArithmeticException("Tidak dapat melakukan pembagian dengan nol.");
        }
        return (double) operand1 / operand2;
    }
}
