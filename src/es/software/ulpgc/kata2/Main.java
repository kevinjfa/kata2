package es.software.ulpgc.kata2;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Users/kevin/Downloads/title.basics.tsv/title.basics.tsv");
        List<Title> titles = new TsvFileReader(file).read();
        HashMap<Title.TitleType, Integer> histogram = new HashMap<>();
        for (Title t: titles) {
            histogram.put(t.getType(), histogram.getOrDefault(t.getType(),0)+1);
        }
        for (Title.TitleType t: histogram.keySet()) {
            System.out.println(t + " " + histogram.get(t));
        }


        for (Title.TitleType t: histogram.keySet()) {
            System.out.println(t);
            int value = histogram.get(t)/1000;
            if (value <= 1) {
                System.out.print("|");
            } else {
                for (int i = 0; i < value; i++) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}
