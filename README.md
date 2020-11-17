# PPKWU_ZAD3

EEIA calendar API

Project is written in Spring Boot technology. 
The main feature of the application is to download information from current or chosen month from EEIA calendar and save it to iCS file.

Downloader class is responsible for downloading data from "http://www.weeia.p.lodz.pl/pliki_strony_kontroler/kalendarz.php" using Jsoup library.
CalendarEndpoint is responsible for mapping an endpoint path and connect it with Downloader service.