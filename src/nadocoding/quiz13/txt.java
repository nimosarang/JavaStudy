package nadocoding.quiz13;

import java.io.File;
import java.io.IOException;

public class txt {
    public static void main(String[] args) {

        String fileName = "saying.txt";

        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
