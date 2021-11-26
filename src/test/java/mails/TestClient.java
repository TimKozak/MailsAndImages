package mails;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClient {
    Client client = new Client("Tim", 18, Gender.MALE, "tima.kozak@gmail.com");

    @Test
    void testClient() {
        assertEquals(client.getName(), "Tim");
        assertEquals(client.getAge(), 18);
        assertEquals(client.getMail(), "tima.kozak@gmail.com");
    }
}