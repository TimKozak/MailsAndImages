package mails;

import java.io.FileNotFoundException;

public class MailSender {

    public boolean sendMail(MailInfo info) throws FileNotFoundException {
        System.out.println(
                info.getText() +
                "\nSent to " +
                info.getClientEmail());
        return true;
    }
}
