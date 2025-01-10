package es.software.ulpgc.kata2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TsvFileReader {
    private final File file;

    public TsvFileReader(File file) {
        this.file = file;
    }

    public List<Title> read() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.readLine();
            return readWith(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Title> readWith(BufferedReader reader) {
        TsvTitleDeserializer des = new TsvTitleDeserializer();
        List<Title> titles = new ArrayList<>();
        while(true) {
            String line = reader.readLine();
            if (line == null) break;
            Title t = des.deserialize(line);
            titles.add(t);
        }
        return titles;
    }
}
