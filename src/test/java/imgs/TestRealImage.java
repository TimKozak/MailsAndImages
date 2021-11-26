package imgs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestRealImage {
    RealImage image = new RealImage("hello_world.png");

    @Test
    void testRealImage() {
        assertEquals(image.getFileName(), "hello_world.png");
    }
}