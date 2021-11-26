package imgs;

public class ProxyPatternDemo {
    public static void main() {
        ProxyImage img = new ProxyImage("hello_world.png");
        img.display();
    }
}
