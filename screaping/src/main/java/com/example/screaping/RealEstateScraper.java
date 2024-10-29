import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class RealEstateScraper {
    public static void main(String[] args) {
        String url = "https://example-emlak.com"; // Değiştirin: scraping yapmak istediğiniz emlak sitesinin URL'si

        try {
            // URL'den HTML içeriğini al
            Document document = Jsoup.connect(url).get();

            // Tüm ev fiyatlarını bul (sınıf adı gerçek sınıf adıyla değiştirilmeli)
            Elements prices = document.select("span.price");

            // Fiyatları yazdır
            for (Element price : prices) {
                System.out.println(price.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

