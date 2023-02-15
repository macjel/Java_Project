package scan;

import java.util.Scanner;

public class Scan {
    Scanner scanner = new Scanner(System.in);

    String name;
    String surename;
    int age;

    public void valueage() {
        age = scanner.nextInt();
    }

    public void valuenaem() {
        name =  scanner.nextLine();
    }
//    public void valuesurename() {
//        surename =  scanner.nextLine();
//    }
    public int returnage() {
        return age;
    }
    public String returnname() {
        return name;
    }
//    public String returnsurname() {
//        return surename;
//    }
}
