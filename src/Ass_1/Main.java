package Ass_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int counter = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j < counter; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
            counter++;
        }
    }
}
