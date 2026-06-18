package core_java_practice.core_java_practice.gcr_codebase.exception_handling.exception_handling_practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstLine {

    public static void main(String[] args) {

        try (BufferedReader bufferedReader =
                     new BufferedReader(
                             new FileReader(
                                     "info.txt"))) {

            String firstLine =
                    bufferedReader.readLine();

            System.out.println(firstLine);

        } catch (IOException exception) {

            System.out.println(
                    "Error reading file");
        }
    }
}

