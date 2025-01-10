package es.software.ulpgc.kata2;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Users/kevin/Downloads/title.basics.tsv/title.basics.tsv");
        List<Title> titles = new TsvFileReader(file);
    }
}
