package com.PPKWU.ZAD3;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Service
public class Downloader {
    public List<String> Download(String year, String month) throws IOException {
        Connection connection = Jsoup.connect("http://www.weeia.p.lodz.pl/pliki_strony_kontroler/kalendarz.php"
                                              + "?rok=" + year +"?month=" + month);
        return Collections.emptyList();
    }
}
