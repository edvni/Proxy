public class RealImage implements Image {
    private final String fileName;
    private boolean imageLoaded = false;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    private void loadImageFromDisk() {
        System.out.println("Loading " + fileName + "...");
        imageLoaded = true;
    }

    public void display() {
        if (!imageLoaded) {
            loadImageFromDisk();
        }
        System.out.println("Displaying " + fileName);
    }

    public void showData() {
        System.out.println("Show data: " + fileName);
    }
}
