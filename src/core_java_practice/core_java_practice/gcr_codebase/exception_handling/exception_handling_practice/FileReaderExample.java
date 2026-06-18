package core_java_practice.core_java_practice.gcr_codebase.exception_handling.exception_handling_practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {

        try {

            BufferedReader bufferedReader =
                    new BufferedReader(
                            new FileReader("data.txt"));

            String line;

            while ((line = bufferedReader.readLine())
                    != null) {

                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException exception) {

            System.out.println("File not found");
        }
    }
}