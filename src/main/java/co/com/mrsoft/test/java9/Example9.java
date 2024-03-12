package co.com.mrsoft.test.java9;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.net.http.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.Image;
import java.awt.image.MultiResolutionImage;
import java.awt.image.BaseMultiResolutionImage;

/**
 * Samples of Multiresolution Image API and new HttpClient API.
 *
 * It requires you add the next modules:
 *  - java.desktop for awt components.
 *  - java.net.http for new http components.
 */
public class Example9 {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        // List of url strings to load.
        List<String> imgUrls = List.of("http://www.tutorialspoint.com/java9/images/logo.png",
                "http://www.tutorialspoint.com/java9/images/mini_logo.png",
                "http://www.tutorialspoint.com/java9/images/large_logo.png");

        List<Image> images = new ArrayList<>();

        for (String urlStr : imgUrls) {
            URI uri = URI.create(urlStr);

            // New http component representation of a http request through Builder pattern.
            HttpRequest request = HttpRequest.newBuilder()
                                    .uri(uri)
                                    // Trick to avoid http 403 error code
                                    .header("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_5) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31")
                                    .GET()
                                    .build();

            // New http component representation of a http response.
            HttpResponse<InputStream> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofInputStream());

            // Check http status code
            if(response.statusCode() != 200) {
                throw new IOException("Invalid http status " + response.statusCode());
            }

            // Read the body of the http response
            BufferedImage image = ImageIO.read(response.body());
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
