package Prosjekt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class URLTilFil {


private final String filnavn = "Telt.txt";
private String url;
private String Nettside;

private List<LagretiFilObserver> observers = new ArrayList<>(); // Liste for å holde alle observatørene

public URLTilFil(String url){

UrlTest(url);

this.url=url;

}

public void startSkrapingOgLagre(){

if (Nettside.equals("NRK")) {
    
    Scraper Scraper = new NRKScraper(url);
    TekstTilFil(Scraper);

}else if (Nettside.equals("WIKI")){   //engelsk wikipedia og norsk, men spårkmoddellen jeg bruker er engelsk.

    Scraper Scraper = new WikiScraper(url);
    TekstTilFil(Scraper);
  
} else {

    Scraper Scraper = new Scraper(url);
    TekstTilFil(Scraper);   

}
 
}   


public void UrlTest(String url) {
   
    String urlRegex = "^https?:\\/\\/(?:www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b(?:[-a-zA-Z0-9()@:%_\\+.~#?&\\/=]*)$";

    
    if (!url.matches(urlRegex)) {
        throw new IllegalArgumentException("Ugyldig URL");
    }

    if (url.startsWith("https://www.nrk.no/") && url.endsWith(".rss")){

        Nettside="NRK";

    }else if (url.startsWith("https://en.wikipedia.org/wiki/") || url.startsWith("https://no.wikipedia.org/wiki/") ){

        Nettside="WIKI"; 

    }

    
}


private void HashMapStringLongTilfil(Map<String, Long> kart, String filnavn) {  //lagrer et HashmapTilFil

try ( BufferedWriter writer = new BufferedWriter(new FileWriter(filnavn))){

    for (Map.Entry<String,Long> Etsett : kart.entrySet()){

        String nøkkel = Etsett.getKey();
        Long verdi = Etsett.getValue();


        writer.write(nøkkel + " , " + verdi);
        writer.newLine();

    }   

         

} catch (Exception e) {
    e.printStackTrace();
}  

notifyObservers();  

}

private void TekstTilFil(Scraper Scraper){


    Scraper.startScraping();
    TestNLP NLP = new TestNLP(Scraper.getTekst());

    if(url.endsWith(".rss")||url.endsWith(".no")){
        System.err.println("lagret i fil");
        HashMapStringLongTilfil(NLP.GetKartFiltrertBortVersteFeilNorsk(),filnavn);

    }else{
        System.err.println("lagret i fil");
        HashMapStringLongTilfil(NLP.getkart(),filnavn);

    } 

} 


public void addObserver(LagretiFilObserver observer) {
    observers.add(observer);
}


public void removeObserver(LagretiFilObserver observer) {
    observers.remove(observer);
}


public void notifyObservers() {
    for (LagretiFilObserver observer : observers) {
        observer.startSpill();
    }
}


public String getNettside() {
    return Nettside;
}




    
}
