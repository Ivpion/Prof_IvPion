package week3.phone_grabber.myUtils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by ivan on 28.05.16.
 */
public class DomParsingUtils {
    private static final String PATH = "http://rozetka.com.ua/lenovo_vibe_s1_white/p4772690/";


    public static void parse(String path) throws ParserConfigurationException, IOException {
        //DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        //DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        Document document = Jsoup.connect(path).get();
        String doc = document.title();
        //System.out.println(document.toString());

        Element el1 = document.select(".detail-title").first();
        String productNameEl1 = el1.text();
        System.out.println(productNameEl1);
    }

    public static void main(String[] args) throws IOException, ParserConfigurationException {
       parse(PATH);
    }
}
