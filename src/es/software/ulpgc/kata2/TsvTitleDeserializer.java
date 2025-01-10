package es.software.ulpgc.kata2;

public class TsvTitleDeserializer implements TitleDeserializer {
    public Title deserialize(String data) {
        return deserialize(data.split("\t"));
    }

    private Title deserialize(String[] data) {
        return new Title(
                data[0],
                Title.TitleType.valueOf(normalize(data[1])),
                data[2]
        );
    }

    private String normalize(String s) {
        String upper = s.toUpperCase();
        String temp = s.replace("-", "");
        return upper.toCharArray()[0] + temp.substring(1);
    }
}
