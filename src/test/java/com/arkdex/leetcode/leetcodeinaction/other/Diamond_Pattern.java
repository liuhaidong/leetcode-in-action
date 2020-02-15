package com.arkdex.leetcode.leetcodeinaction.other;

import java.util.Scanner;

public class Diamond_Pattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size");
        int sizeOfDiamond = scanner.nextInt();
        int cols = 1;
        int startPoint = 0;
        int spaces = sizeOfDiamond / 2;
        for (int i = 1; i <= sizeOfDiamond; i++) {
            for (int k = 1; k <= spaces; k++) {
                System.out.print("");
            }
            if (i < sizeOfDiamond / 2 + 1) {
                startPoint = i;
                spaces = spaces - 1;
            } else {
                startPoint = (sizeOfDiamond + 1) - i;
                spaces = spaces + 1;
            }

            for (int j = 1; j <= cols; j++) {
                int midPoint = cols / 2 + 1;
                System.out.print(startPoint);
                if (j < midPoint) {
                    startPoint--;
                } else {
                    startPoint++;
                }
            }
            System.out.println();
            if (i < sizeOfDiamond / 2 + 1) {
                cols = cols + 2;
            } else {
                cols = cols - 2;
            }
        }
    }
}