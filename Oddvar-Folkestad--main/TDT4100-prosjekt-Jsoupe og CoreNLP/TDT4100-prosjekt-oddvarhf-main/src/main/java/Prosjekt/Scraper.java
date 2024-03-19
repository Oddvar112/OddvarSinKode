package Prosjekt;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;



public class Scraper {

private Document doc;

private String Tekst;

protected String url;



public Scraper(String url){

this.url = url;
   
}


public void startScraping(){

this.Tekst = fåAllTekst(ConnectTilSide(url));


}
   

protected Document ConnectTilSide(String url){ 

    try {

        return Jsoup.connect(url).get();
        
    } catch (IOException e) {

        throw new RuntimeException("Kunne ikke koble til siden: " + url, e);

    }
    
}


public Document getDoc(){

    return this.doc;

}



public String fåAllTekst(Document doc){

    return  doc.text();

}

public String getTekst(){

    return Tekst;

}

public String getUrl(){

    return Tekst;

}



}