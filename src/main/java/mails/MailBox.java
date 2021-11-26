package mails;

import java.io.FileNotFoundException;
import java.util.LinkedList;

public class MailBox {
    private final LinkedList<MailInfo> infos = new LinkedList<>();

    public void addInfo(MailInfo info) {
        infos.add(info);
    }

    public void sendAll() throws FileNotFoundException {
        MailSender sender = new MailSender();

        for (MailInfo info: infos) {
            sender.sendMail(info);
        }
    }
}