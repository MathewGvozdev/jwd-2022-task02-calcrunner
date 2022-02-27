package com.mathewgv.infohandling.calcrunner;

import com.mathewgv.infohandling.calclib.Calculator;

import java.util.List;
import java.util.Scanner;

public class CalculatorRunner {

    public static void main(String[] args) {
        String example1 = "12 + 32";
        String example2 = "542-12*4";
        String example3 = "12 + 32 - (134 + 12) / (41-32)";

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String exampleFromScanner1 = scanner.nextLine();
        String exampleFromScanner2 = scanner.nextLine();

        List<String> expressions = List.of(example1, example2, example3, exampleFromScanner1, exampleFromScanner2);

        for (String example : expressions) {
            Calculator calculator = new Calculator(example);
            System.out.println(calculator.solve());
        }
    }
}
