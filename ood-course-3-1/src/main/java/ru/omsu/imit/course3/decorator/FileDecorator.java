package ru.omsu.imit.course3.decorator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDecorator implements Data {

    private String s;
    private File file;

    public FileDecorator(final String filename) {
        file = new File(filename);
    }

    @Override
    public void write(String s) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(s);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String read() {
        String s = "";
        try {
            Scanner scanner = new Scanner(file);
            s = scanner.next();
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return s;
    }
}
