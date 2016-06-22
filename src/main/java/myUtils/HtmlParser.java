package myUtils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 27.05.16.
 */
public class HtmlParser {

    public static void main(String[] args) throws IOException {
        List<String> linksList = new ArrayList<>();
        Document document = Jsoup.parse(new URL("http://vk.com/search?c[group]=30024988&c[section]=people"), 100000000 );
        Element el = document.body();
        Elements elements = el.getElementsByTag(" ");
        for (Element element : elements) {
            String pref = element.attr("id");
            if (pref.contains("t"));
            linksList.add(pref);
        }

        linksList.stream().forEach(System.out::print);
        el.select("wefwv");

    }
}