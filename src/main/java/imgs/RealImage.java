package imgs;

import lombok.Getter;

@Getter
public class RealImage implements Image{
    private final String fileName;

    public RealImage(String filename) {
        this.fileName = filename;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying RealImage");
    }

    public void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }
}
