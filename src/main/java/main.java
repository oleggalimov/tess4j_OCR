import java.io.File;
import net.sourceforge.tess4j.*;

/**
 * Created by oleg on 18.02.2017.
 */
public class main {
    public static void main(String[] args) {
        // ImageIO.scanForPlugins(); // for server environment
        File imageFile = new File("C:\\Users\\oleg\\Tess test\\test.pdf");
        ITesseract instance = new Tesseract(); // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping
        //instance.setDatapath("C:\\Users\\oleg\\Desktop\\Projects\\sb_tess4j_ocr\\src\\main\\java\\tessdata"); // replace <parentPath> with path to parent directory of tessdata
         instance.setLanguage("ru");
        File f = new File(".");
        System.out.println(f.getAbsolutePath());
        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}
