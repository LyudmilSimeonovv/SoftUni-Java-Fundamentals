package com.company.student_06;import java.util.ArrayList;import java.util.List;import java.util.Scanner;public class Main {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        String input = scanner.nextLine();        List<Students> studentList = new ArrayList<>();        while (!input.equals("end")) {            String[] studentInformation = input.split("\\s+");            String firstName = studentInformation[0];            String lastName = studentInformation[1];            int age = Integer.parseInt(studentInformation[2]);            String city = studentInformation[3];            Students students = new Students(firstName, lastName, age, city);            studentList.add(students);            input = scanner.nextLine();        }        String filterCity = scanner.nextLine();        for (int i = 0; i < studentList.size() - 1; i++) {            String currentFirstName = studentList.get(i).getFirstName();            String currentLastNaame = studentList.get(i).getLastName();            String nextFirstName = studentList.get(i + 1).getFirstName();            String nexLastName = studentList.get(i + 1).getLastName();            if (currentFirstName.equals(nextFirstName) && currentLastNaame.equals(nexLastName)) {                studentList.remove(i);                i = -1;            }        }        for (int i = 0; i <studentList.size() ; i++) {            if (studentList.get(i).getHomeTown().equals(filterCity)){                System.out.printf("%s %s is %d years old%n",studentList.get(i).getFirstName()                ,studentList.get(i).getLastName(),studentList.get(i).getAge());            }        }        }    }