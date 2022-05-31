package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1() {
        try (FileWriter filewriter = new FileWriter("Alphabet.txt")) {
            for (char i = 'A'; i <= 'Z'; i++) {
                for (char j = 'a'; j <= 'z'; j++) {
                    if ((j - i) == 32) {
                        filewriter.write(" " + i + "" + j + "\n");
                    }
                }
            }
            for (int i = 0; i < 10; i++) {
                filewriter.write(" "+i +" "+ "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method2() {
        try (FileReader fileReader = new FileReader("Alphabet.txt")) {
            Scanner scanner = new Scanner(fileReader);
            int k = 0;
            while (scanner.hasNextLine()) {
                k++;
                System.out.print(k);
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
