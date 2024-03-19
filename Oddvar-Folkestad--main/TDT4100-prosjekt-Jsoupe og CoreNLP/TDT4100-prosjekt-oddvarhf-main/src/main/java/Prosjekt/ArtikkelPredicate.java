package Prosjekt;
import java.util.function.Predicate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;



public class ArtikkelPredicate implements Predicate<Document>{

@Override
public boolean test(Document doc) {




boolean erArtikkel = false;
           
        
Elements metaTags = doc.select("meta[name=author]");   //leiter etter en tag author på siden 
        
String authorContent = metaTags.attr("content"); //Henter ut conetet av taggen 
        
if (authorContent.isEmpty()) {
    return erArtikkel; //nei
}
            
        
if (metaTags.attr("content").equalsIgnoreCase("nrk") || metaTags.isEmpty()){
        
    return erArtikkel; //nei
        
}
        
        
erArtikkel=true;
return erArtikkel; //ja
        
        
} 

}

//Alle artikkler ifra NRK har en Aurhor, hvis det ikke er en artikkel, se typ forside eller urix.no vil forfatteren være NRK
