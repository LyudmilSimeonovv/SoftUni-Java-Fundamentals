package com.company;import java.util.Arrays;import java.util.Collections;import java.util.List;import java.util.Scanner;import java.util.stream.Collectors;public class RemoveNegativesAndReverse_07 {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))                .map(Integer::parseInt).collect(Collectors.toList());        for (int i = 0; i < numbers.size(); i++) {            if (numbers.get(i) < 0) {                numbers.remove(i);                i = -1;            }        }        Collections.reverse(numbers);        for (Integer number : numbers) {            System.out.print(number + " ");        }        if (numbers.size() == 0) {            System.out.println("empty");        }    }}