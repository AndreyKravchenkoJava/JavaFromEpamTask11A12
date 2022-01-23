package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Text.txt"));
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(scanner.next());
        }
        scanner.close();

        Collections.sort(list);

        System.out.println(list);
    }
}
