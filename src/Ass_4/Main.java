package Ass_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Table Name: ");
        int tableName = sc.nextInt();
        System.out.print("Enter the Table Limit: ");
        int tableLimit = sc.nextInt();
        for (int i = 1; i <= tableLimit; i++) {
            System.out.println(tableName + " * " + i + " = " + (tableName * i));
        }
    }
}
