// Варiант 4.

import java.util.Scanner;

public class LabFirst1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення дійсного типу.
        System.out.print("Введiть число дiйсного типу: ");
        double inputDouble = scanner.nextDouble();

        // Варіант 1: вхідні дані дійсного типу, результат - дійсного.
        double result1 = inputDouble * 2.5;
        System.out.println("Результат у варiантi 1 (дiйсний тип): " + result1);

        // Варіант 2: вхідні дані цілого типу, результат - дійсного.
        int inputInt = (int) inputDouble;
        double result2 = inputInt * 2.5;
        System.out.println("Результат у варiантi 2 (цiлий тип, результат - дiйсний): " + result2);

        // Варіант 3: вхідні дані дійсного типу, результат - цілого.
        int result3 = (int) (inputDouble * 2.5);
        System.out.println("Результат у варiантi 3 (дiйсний тип, результат - цiлий): " + result3);

        scanner.close();
    }
}
