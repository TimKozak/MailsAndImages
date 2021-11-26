package imgs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestProxyImage {
    ProxyImage image = new ProxyImage("hello_world.png");

    @Test
    void testProxyImage() {
        assertEquals(image.getFileName(), "hello_world.png");
        assertNull(image.getRealImage());
    }
}