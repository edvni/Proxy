import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // create a list of images
        List<Image> photoAlbum = new ArrayList<>();
        photoAlbum.add(new ProxyImage("photo1.jpg"));
        photoAlbum.add(new ProxyImage("photo2.jpg"));
        photoAlbum.add(new ProxyImage("photo3.jpg"));

        // show only the metadata for each image
        System.out.println("---Metadata for each image---");
        for (Image image : photoAlbum) {
            image.showData();
        }
        System.out.println();

        // now load and display each image
        System.out.println("---Load and display each image---");
        for (Image image : photoAlbum) {
            image.display();
        }
    }
}
