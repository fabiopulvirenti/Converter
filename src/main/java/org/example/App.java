package org.example;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your number to convert: ");
        String numberInput = scanner.nextLine();
        int number = Integer.parseInt(numberInput);

        String romanNumeral = converter(number);
        System.out.println("Roman Numeral: " + romanNumeral);
    }

    public static String converter(int numberToConvert) {
        StringBuilder romanNumToConvert = new StringBuilder();



        if (numberToConvert >= 1000) {
            int numOfM = numberToConvert / 1000;
            for (int i = 0; i < numOfM; i++) {
                romanNumToConvert.append("M");
                numberToConvert = numberToConvert - 1000;
            }
        }
        if (numberToConvert >= 900) {
            int numOfM = numberToConvert / 900;
            for (int i = 0; i < numOfM; i++) {
                romanNumToConvert.append("CM");
                numberToConvert = numberToConvert - 900;
            }
        }

        if (numberToConvert >= 500) {
            int numOfC = numberToConvert / 500;
            for (int i = 0; i < numOfC; i++) {
                romanNumToConvert.append("D");
                numberToConvert = numberToConvert - 500;
            }
        }

        if (numberToConvert >= 400) {
            int numOfC = numberToConvert / 400;
            for (int i = 0; i < numOfC; i++) {
                romanNumToConvert.append("CD");
                numberToConvert = numberToConvert - 400;
            }
        }

        if (numberToConvert >= 100) {
            int numOfC = numberToConvert / 100;
            for (int i = 0; i < numOfC; i++) {
                romanNumToConvert.append("C");
                numberToConvert = numberToConvert - 100;
            }
        }

        if (numberToConvert >= 90) {
            int numOfC = numberToConvert / 90;
            for (int i = 0; i < numOfC; i++) {
                romanNumToConvert.append("XC");
                numberToConvert = numberToConvert - 90;
            }
        }

        if (numberToConvert >= 50) {
            int numOfC = numberToConvert / 50;
            for (int i = 0; i < numOfC; i++) {
                romanNumToConvert.append("L");
                numberToConvert = numberToConvert - 50;
            }
        }

        if (numberToConvert >= 40) {
            int numOfC = numberToConvert / 40;
            for (int i = 0; i < numOfC; i++) {
                romanNumToConvert.append("XL");
                numberToConvert = numberToConvert - 40;
            }
        }

        if (numberToConvert >= 10) {
            int numOfX = numberToConvert / 10;
            for (int i = 0; i < numOfX; i++) {
                romanNumToConvert.append("X");
                numberToConvert = numberToConvert - 10;
            }
        }

        if (numberToConvert == 9) {
            int numOfX = numberToConvert / 9;
            for (int i = 0; i < numOfX; i++) {
                romanNumToConvert.append("IX");
                numberToConvert = numberToConvert - 9;
            }
        }

        if (numberToConvert >= 5) {
            int numOfX = numberToConvert / 5;
            for (int i = 0; i < numOfX; i++) {
                romanNumToConvert.append("V");
                numberToConvert = numberToConvert - 5;
            }
        }


        if (numberToConvert == 4) {
            int numOfX = numberToConvert / 4;
            for (int i = 0; i < numOfX; i++) {
                romanNumToConvert.append("IV");
                numberToConvert = numberToConvert - 4;
            }
        }

        if (numberToConvert >= 1) {
            for (int i = 0; i < numberToConvert; i++) {
                romanNumToConvert.append("I");
            }
        }

        return romanNumToConvert.toString();
    }
}




