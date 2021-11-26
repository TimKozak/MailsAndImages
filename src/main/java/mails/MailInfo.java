package mails;

import lombok.Getter;
import lombok.Setter;

import java.io.FileNotFoundException;
import java.util.HashMap;

@Setter @Getter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public MailInfo() {}

    public String getText() throws FileNotFoundException {
        HashMap<String, String> templates = new HashMap<String, String>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", (Integer.toString(client.getAge())));
        String text = mailCode.generateText();

        for(String key: templates.keySet()){
            text = text.replace(key, templates.get(key));
        }

        return text;
    }

    public String getClientEmail() {
        return client.getMail();
    }
}
