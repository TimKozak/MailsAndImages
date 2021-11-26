package mails;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("src/main/happy_birthday.txt"), GREETINGS("./greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() throws FileNotFoundException {
        StringBuilder text = new StringBuilder();
        File file = new File(filename);
        Scanner reader = new Scanner(file);

        while (reader.hasNextLine()) {
            text.append(reader.nextLine());
            text.append("\n");
        }
        reader.close();
        return text.toString();
    }
}
