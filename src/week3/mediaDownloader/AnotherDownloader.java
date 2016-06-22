package week3.mediaDownloader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by ivan on 29.05.16.
 */
public class AnotherDownloader {


    private static final String PATH = "http://www.ex.ua/101546776?r=3,23776" ;

    public static void parse(String path) throws IOException {


        Document doc = Jsoup.connect(path).get();
        //String tdoc = doc.title();

        //System.out.println(doc);

        Elements links = doc.select("a[href]");
        //System.out.println(links);
        for (Element link : links) {
           if (link.attr("href").contains("get"))
               System.out.println(link);
        }

    }


    public static void main(String[] args) throws IOException {
        parse(PATH);
    }
}
