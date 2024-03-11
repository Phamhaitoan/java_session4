package Ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập số a: ");
        double a = scanner.nextDouble();

        System.out.print("nhâp số b: ");
        double b = scanner.nextDouble();

        System.out.print("nhập số c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        equation.Gpt();
    }
}

