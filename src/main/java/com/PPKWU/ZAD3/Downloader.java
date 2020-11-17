package com.PPKWU.ZAD3;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class Downloader {
    public List<String> Download(String year, String month) throws IOException {
        List<String> events = new ArrayList<>();
        Connection connection = Jsoup.connect("http://www.weeia.p.lodz.pl/pliki_strony_kontroler/kalendarz.php"
                                              + "?rok=" + year +"?month=" + month);

        Elements days = connection.get().select("a.active");
        Elements eventNames = connection.get().select("div.InnerBox");

        for (int i=0;i<days.size();i++ ) {
            String day = days.get(i).text();
            String name = eventNames.get(i).text();
            events.add(day+ " " + name);
        }

        return events;
    }
}
