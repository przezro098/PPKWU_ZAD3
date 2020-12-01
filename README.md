# PPKWU_ZAD3

EEIA calendar API

Project is written in Spring Boot technology. 
The main feature of the application is to download information from current or chosen month from EEIA calendar and save it to iCS file.

Downloader class is responsible for downloading data from "http://www.weeia.p.lodz.pl/pliki_strony_kontroler/kalendarz.php" using Jsoup library.
CalendarEndpoint is responsible for mapping an endpoint path and connect it with Downloader service.

To use please:

1) build project using any Java IDE,
2) make sure that project is running
3) type in your browser "http://localhost:8080/calendar/{year}/{month}"
4) data will be returned as a iCS file.

Case of usages : 
1) Typing http://localhost:8080/calendar/2020/10 will return a string which contains events from October and it can be saved as .ics file.
2) Typing http://localhost:8080/calendar/2020/03 will return a string which contains events from March and it can be saved as .ics file.
