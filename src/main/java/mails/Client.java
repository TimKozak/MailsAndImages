package mails;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;
    private String mail;

    public Client() {
        this.id = ClientIdGenerator.genId();
    }

    public Client(String name, int age, Gender sex, String mail) {
        this.id = ClientIdGenerator.genId();
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mail = mail;
    }

    private static class ClientIdGenerator {
        private static int counter = 0;

        public static int genId() {
            return counter++;
        }
    }
}