package step.learning.control;

import java.util.Scanner;

public class MultiplicationTable {
    public void run() {
        System.out.println();
        System.out.println("Hello from MultiplicationTable");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = scanner.nextInt();
        if (n < 2 || n > 32)
            System.out.println("Wrong number");
        else {
            for (int i = 1; i <= n; i++) {
                System.out.println();
                for (int j = 1; j <= n; j++) {
                    if (i * j < 10)
                        System.out.print("   " + i * j);
                    else if (i * j < 100)
                        System.out.print("  " + i * j);
                    else
                        System.out.print(" " + i * j);
                }
            }
            System.out.println();
        }
    }
}
