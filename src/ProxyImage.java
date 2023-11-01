public class ProxyImage implements Image{
    private RealImage realImage;
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

    public void showData() {
        System.out.println("Showing data: " + fileName);
    }
}
