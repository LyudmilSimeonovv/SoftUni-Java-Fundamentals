package com.company;import java.util.Arrays;import java.util.Scanner;public class PalindromeIntegers_09 {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        String input = scanner.nextLine();        reverseNumbers(input, scanner);    }    static void reverseNumbers(String command, Scanner scanner) {        while (!command.equals("END")) {            String[] numbers = command.split("");            String[] reverseNumbers = new String[numbers.length];            for (int i = numbers.length - 1; i >= 0; i--) {                String temp = numbers[i];                reverseNumbers[reverseNumbers.length - 1 - i] = temp;            }            boolean isEqual = false;            for (int i = 0; i < numbers.length; i++) {                if (numbers[i].equals(reverseNumbers[i])) {                    isEqual = true;                } else {                    isEqual = false;                    System.out.println("false");                    break;                }            }            if (isEqual) {                System.out.println("true");            }            command = scanner.nextLine();        }    }}