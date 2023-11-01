import java.util.List;

public class Main {
    public static void main(String[] args) {

        // create a list of images
        List<Image> images = List.of(
                new ProxyImage("HiRes_10MB_Photo1"),
                new ProxyImage("HiRes_10MB_Photo2"),
                new ProxyImage("HiRes_10MB_Photo3"),
                new ProxyImage("HiRes_10MB_Photo4"),
                new ProxyImage("HiRes_10MB_Photo5")
        );

        // show only the metadata for each image
        for (Image image : images) {
            image.showData();
        }

        // now load and display each image
        for (Image image : images) {
            image.display();
        }
    }
}
