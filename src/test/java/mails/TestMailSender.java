package mails;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class TestMailSender {
    MailSender sender = new MailSender();
    MailInfo mailinfo = new MailInfo();

    @BeforeEach
    void setUp() {
        Client client = new Client("Tim", 18, Gender.MALE, "tima.kozak@gmail.com");
        mailinfo.setClient(client);
        mailinfo.setMailCode(MailCode.HAPPY_BIRTHDAY);
    }
    @Test
    void testMailSender() throws FileNotFoundException {
        assertTrue(sender.sendMail(mailinfo));
    }
}