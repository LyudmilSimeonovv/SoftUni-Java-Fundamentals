package com.company;import java.text.DecimalFormat;import java.util.*;public class CountRealNumbers {    public static void main(String[] args) {        Scanner scanner = new Scanner((System.in));        //String input = scanner.nextLine();        double[] number = Arrays.stream(scanner.nextLine().split(" "))                .mapToDouble(Double::parseDouble).toArray();        Map<Double, Integer> finalArray = new TreeMap<>();        for (double v : number) {            if (!finalArray.containsKey(v)) {                finalArray.put(v, 1);            } else {                finalArray.put(v, finalArray.get(v) + 1);            }        }        DecimalFormat decimalFormat = new DecimalFormat("#.#######");        finalArray.entrySet()                .forEach(e -> {                    System.out.printf("%s -> %d%n", decimalFormat.format(e.getKey()), e.getValue());                });    }}