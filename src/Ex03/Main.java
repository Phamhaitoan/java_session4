package Ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle1 = new Circle();
        circle1.inputData(scanner);
        circle1.display();
    }

}
