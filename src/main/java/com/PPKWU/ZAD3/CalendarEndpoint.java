package com.PPKWU.ZAD3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/calendar")
public class CalendarEndpoint {

    private Downloader downloader;

    @Autowired
    public CalendarEndpoint(Downloader downloader)
    {
        this.downloader = downloader;
    }

    @GetMapping("/{year}/{month}")
    public String getEvents(@PathVariable String year, @PathVariable String month) throws IOException {
        return downloader.Download(year,month);
    }

}
