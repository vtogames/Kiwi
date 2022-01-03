package com.vto.kiwi.runtime.manage;

import com.vto.kiwi.runtime.exceptions.CannotFindKiwiFileException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KiwiFileReader {

    public String read(File file) {
        StringBuilder fileContents = new StringBuilder();
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new CannotFindKiwiFileException(file.getName());
        }

        while (fileScanner.hasNextLine()) {
            fileContents.append(fileScanner.nextLine());
        }

        return fileContents.toString();
    }

}
