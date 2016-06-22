package week3.mediaDownloader;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by ivan on 29.05.16.
 */
public class Downloader {

    private static final String FILE = "src/week3/mediaDownloader/resurses/audio1.mp3";
    static String url = "";

    public static void load(String url, String dest) throws IOException {

        URLConnection conn = new URL(url).openConnection();
        InputStream istream = conn.getInputStream();

        OutputStream ostream = new FileOutputStream(new File(dest));

        byte[] buff = new byte[4096];
        int len;
        while((len = istream.read(buff)) > 0){
            ostream.write(buff,0,len);
        }
        ostream.close();
    }

    public static void main(String[] args) throws IOException {
        load(url, FILE);
    }
}
