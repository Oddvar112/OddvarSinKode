package Prosjekt;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WikiScraper extends Scraper{


private String Tekst;



public WikiScraper(String url){

    super(url);


}

@Override 
public void startScraping() {

    this.Tekst = fåAllTekst(super.ConnectTilSide(url));


}

@Override
public String fåAllTekst(Document doc){

    Elements Wikitable = doc.select("table.wikitable"); //wikitabel

    Elements tekstifraArtikkel = doc.select("div.mw-content-ltr.mw-parser-output>p"); //teksten
        
    Elements innhuggedePoeng = doc.select("div.mw-content-ltr.mw-parser-output>ul"); //innhuugning på siden/bulletpoints
        
    
    //tringtilFil(FilterForWikiTabel(Wikitable)); //det som ligger i tables er ikke fullstendig setniger så CORENLP får utrolig mye mer feil på dette da,
    //det er vant til setningsstruktur. 
    //det blir behandler men for best resultat ta noe uten tabel. 

    return  tekstifraArtikkel.text()+" "+innhuggedePoeng.text()+" "+FilterForWikiTabel(Wikitable);


}

private String FilterForWikiTabel(Elements Wikitable){

    String pattern = "\\([^a-zA-Z]+\\)"; //fjerner alt som er inni en parantes som ikke er bokstaver. 
    String pattern2 = "\\[([0-9]+)\\]"; //tar ut allt som ligger inni [] som er tall
    String pattern3= "[0-9]+"; //tar ut det som bare er tall det trenger vi ikke

    String tekstFiltrert = Arrays.stream(Wikitable.text().split("\\s+")) 
    .filter(word -> !word.matches(pattern)) 
    .filter(word -> !word.matches(pattern2))
    .filter(word -> !word.matches(pattern3))
    .collect(Collectors.joining(" ")); 

    return tekstFiltrert;
        
}


@Override
public String getTekst() {
    return Tekst;
}

    
}
