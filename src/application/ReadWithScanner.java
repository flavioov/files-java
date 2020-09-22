package application;

import java.io.File;
import java.io.IOException;

public class ReadWithScanner {
    public static void main(String[] args) {

        File file = new File("/home/flavio/teste.txt");

        try (java.util.Scanner sc = new java.util.Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        }



    }
}