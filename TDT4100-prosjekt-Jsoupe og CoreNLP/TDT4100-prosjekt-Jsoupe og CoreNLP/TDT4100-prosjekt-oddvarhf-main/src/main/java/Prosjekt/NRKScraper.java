package Prosjekt;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class NRKScraper extends Scraper{



private String Tekst;
ArtikkelPredicate artikkelPredicate = new ArtikkelPredicate();


public NRKScraper(String url){

    super(url);


}



@Override 
public void startScraping() {

FåAllTekstSamlet(FilterForArtikkelNRK(fåAlleLinkerRss(super.ConnectTilSide(url)))); 


}


private ArrayList<String> FilterForArtikkelNRK(ArrayList<String> alleLinker ){

    //stream gjør connecter til hver siden linken tiøhører kjører predicate på siden filterer ut det som ikke er 
    // filterer ut det som ikke er artikkel og gjør det om til en link igjen som blir plassert i en ArrayList.

    ArrayList<String> linker = alleLinker
    .stream()
    .map(link -> ConnectTilSide(link)) 
    .filter(artikkelPredicate)                 
    .map(Document::location)                   
    .collect(Collectors.toCollection(ArrayList::new));

    return linker;

}

public ArrayList<String> fåAlleLinkerRss(Document doc){ //Henter ut alle linker på rss feeden som går til artikkler.

    Elements linker = doc.select("item > link");
    return linker.stream().map(link -> link.text()).collect(Collectors.toCollection(ArrayList::new));

}
   
@Override
public String fåAllTekst(Document doc){

    Elements AB = doc.select(".article-body");
    Elements AB2 = doc.select("header>div>p");
    Elements AB3 = doc.select("header>h1");
       
    String text = AB3.text()+" "+AB2.text()+" "+AB.text();  //Får all tekst av selve artikkelen. Overskrift+innledning+body av artikkel. 

    return text;

}


public void FåAllTekstSamlet(ArrayList<String> filtrertLinker){ //stream som samler all tekst ifra de filtrerte linkene, her med 2 avsnitt mellom hver. 
 
    this.Tekst = filtrertLinker.stream().map(link -> fåAllTekst(ConnectTilSide(link))).collect(Collectors.joining("\n\n")); //mellommrom slik at jeg kan se hver artikkel for seg i fil

}

@Override
public String getTekst(){
    return Tekst;
}

    
}
