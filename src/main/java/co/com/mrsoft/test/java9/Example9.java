package co.com.mrsoft.test.java9;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.awt.Image;
import java.awt.image.MultiResolutionImage;
import java.awt.image.BaseMultiResolutionImage;

/**
 * Samples of Multiresolution Image API
 */
public class Example9 {
    public static void main(String[] args) throws IOException {
        List<String> imgUrls = List.of("http://www.tutorialspoint.com/java9/images/logo.png",
                "http://www.tutorialspoint.com/java9/images/mini_logo.png",
                "http://www.tutorialspoint.com/java9/images/large_logo.png");

        List<Image> images = new ArrayList<>();

        for (String urlStr : imgUrls) {
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // This is a trick to avoid http 403.
            connection.setRequestProperty(
                    "User-Agent",
                    "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_5) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");

            BufferedImage image = ImageIO.read(connection.getInputStream());
            images.add(image);
        }

        // read all images into one multiresolution image
        MultiResolutionImage multiResolutionImage = new BaseMultiResolutionImage(images.toArray(new Image[0]));

        // get all variants of images
        List<Image> variants = multiResolutionImage.getResolutionVariants();

        System.out.println("Total number of images: " + variants.size());

        for (Image img : variants) {
            System.out.println(img);
        }

        // get a resolution-specific image variant for each indicated size
        Image variant1 = multiResolutionImage.getResolutionVariant(156, 45);
        System.out.printf("\nImage for destination[%d,%d]: [%d,%d]",
                156, 45, variant1.getWidth(null), variant1.getHeight(null));

        Image variant2 = multiResolutionImage.getResolutionVariant(311, 89);
        System.out.printf("\nImage for destination[%d,%d]: [%d,%d]", 311, 89,
                variant2.getWidth(null), variant2.getHeight(null));

        Image variant3 = multiResolutionImage.getResolutionVariant(622, 178);
        System.out.printf("\nImage for destination[%d,%d]: [%d,%d]", 622, 178,
                variant3.getWidth(null), variant3.getHeight(null));

        Image variant4 = multiResolutionImage.getResolutionVariant(300, 300);
        System.out.printf("\nImage for destination[%d,%d]: [%d,%d]", 300, 300,
                variant4.getWidth(null), variant4.getHeight(null));
    }
}
