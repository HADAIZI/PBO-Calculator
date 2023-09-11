package id.its.pbo;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int operand1 = 10;
        int operand2 = 5;

        // Contoh penggunaan method pada kalkulator
        int hasilTambah = calculator.add(operand1, operand2);
        int hasilKurang = calculator.subtract(operand1, operand2);
        int hasilKali = calculator.multiply(operand1, operand2);
        double hasilBagi = calculator.divide(operand1, operand2);

        System.out.println("Hasil Penambahan: " + hasilTambah);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Perkalian: " + hasilKali);
        System.out.println("Hasil Pembagian: " + hasilBagi);
    }
}
