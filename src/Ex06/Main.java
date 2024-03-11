package Ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employee01 = new Employee[6];
        for (int i = 0; i < employee01.length ; i++) {
            employee01[i] = new Employee();
            employee01[i].inputData(scanner);
            employee01[i].displayData();
            employee01[i].calSalary();

        }
    }
}
