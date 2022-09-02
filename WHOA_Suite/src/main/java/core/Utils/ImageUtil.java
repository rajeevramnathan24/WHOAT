package core.Utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

public class ImageUtil {


    private static final int IMG_WIDTH = 900;
    private static final int IMG_HEIGHT = 450;

    /**
     * resizeImage
     * @param input
     * @param target
     * @throws IOException
     */
    public static void resizeImage(
    		String sourceFilePath, String targetFilePath) throws IOException {

        Path source = Paths.get(sourceFilePath);
        Path target = Paths.get(targetFilePath);
        
        InputStream inputFile = new FileInputStream(source.toFile());
        BufferedImage originalImage = ImageIO.read(inputFile);

        /**
         * SCALE_AREA_AVERAGING
         * SCALE_DEFAULT
         * SCALE_FAST
         * SCALE_REPLICATE
         * SCALE_SMOOTH
         */
        Image newResizedImage = originalImage
              .getScaledInstance(IMG_WIDTH, IMG_HEIGHT, Image.SCALE_SMOOTH);

        String s = target.getFileName().toString();
        String fileExtension = s.substring(s.lastIndexOf(".") + 1);

        // we want image in png format
        ImageIO.write(convertToBufferedImage(newResizedImage),
                fileExtension, target.toFile());
    }

    
    /**
     * convertToBufferedImage
     * @param img
     * @return
     */
    public static BufferedImage convertToBufferedImage(Image img) {

        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }

        // Create a buffered image with transparency
        BufferedImage bi = new BufferedImage(
                img.getWidth(null), img.getHeight(null),
                BufferedImage.TYPE_INT_ARGB);

        Graphics2D graphics2D = bi.createGraphics();
        graphics2D.drawImage(img, 0, 0, null);
        graphics2D.dispose();

        return bi;
    }
	
	
}
