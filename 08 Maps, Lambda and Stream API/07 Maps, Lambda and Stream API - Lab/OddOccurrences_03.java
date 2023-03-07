package com.company;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Map<String, Integer> oddOccurrences = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            String currentText = input[i].toLowerCase();
            if (!oddOccurrences.containsKey(currentText)) {
                oddOccurrences.put(currentText, 1);
            } else {
                oddOccurrences.put(currentText, oddOccurrences.get(currentText) + 1);
            }
        }
        List<String> odd = new ArrayList<>();

        for (var entry : oddOccurrences.entrySet()) {
            if (entry.getValue() % 2 != 0){
                odd.add(entry.getKey());
            }
        }
        for (int i = 0; i < odd.size(); i++) {
            if (i == odd.size() - 1){
                System.out.print(odd.get(i));
                break;
            }
            System.out.print(odd.get(i) + ", ");
        }
    }
}
