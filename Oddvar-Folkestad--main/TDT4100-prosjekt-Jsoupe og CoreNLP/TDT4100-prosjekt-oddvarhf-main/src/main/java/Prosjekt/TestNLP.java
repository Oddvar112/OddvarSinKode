package Prosjekt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
//import edu.stanford.nlp.pipeline.CoreEntityMention;  //Hvis man skal bruke den CoreEntityMention
import edu.stanford.nlp.pipeline.StanfordCoreNLP;




public class TestNLP {

private final List<String> forbudteOrd = List.of("Meg", "Jeg", "Deg", "Oss", "Hun", "?", ".", "–", "Da","Menn", "Dame", "Ein", "Eller"); //lagt til fordi den ofte tok dette som personer siden den er laget for engelsk, så filterer ut ord den ofte feiler på. 

ArrayList<String> navnliste = new ArrayList<>();

ArrayList<String> storliste = new ArrayList<>();

Map<String, Long> kart = new HashMap<>();

HashmapPredicate HashmapPredicate = new HashmapPredicate();


private final String fancySteamkomponenter =  "tokenize, ssplit, pos, lemma, ner"; 

//tokenize gjør om til individuelle enheter. 
//ssplit deler inn i setninger. 
//pos tildeler ordklasser til hver token.
//lemma reduserer ord til sin base eks Darth Vader's lightsaber = Darth Vader lightsaber, løpende" til "løpe".
//ner er navngjennkjennelse enne prosessen identifiserer og kategoriserer nøkkelinformasjon (enheter) i teksten til forhåndsdefinerte kategorier.
//Finnes flere man kan ta i bruk og bygge videre men denne pipelinnen holder for det jeg skal bruke den til.



public TestNLP(String tekst){

        
    CoreDocument CD = new CoreDocument(tekst);
    
    kjørPipeline(CD); //denne fuunker best på norsk etter hva jeg har sett da jeg implimenter en rekke filter. 

    //kjørPipelineV2wiki(CD); //bruuker innebygget funksjon som tester etter sammenhengde navn, eterytags


}



// private void kjørPipelineV2wiki(CoreDocument CD){

//      Properties props = new Properties();
//         props.setProperty("annotators", "tokenize,ssplit,pos,lemma,ner");
//         StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

        

        
    

//         // Anvender NLP-pipeline på dokumentet
//         pipeline.annotate(CD);

//         // Går gjennom alle setninger i dokumentet
//         for (CoreEntityMention em : CD.entityMentions())
//             if (em.entityType().equals("PERSON")){
//                 System.err.println(em.text());
//                  navnliste.add(em.text());
//                  oppdaterHashmap(navnliste);
//                  navnliste.clear();
//             }
              


// }


private void kjørPipeline(CoreDocument CD){ //Her blir teksten kjørt igjennompipeline 


    Properties props = new Properties();
    props.setProperty("annotators", fancySteamkomponenter);
    
    props.setProperty("coref.algorithm", "neural");
    StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

        

    pipeline.annotate(CD); //fancy steam på en måte for å se callsen til ord. 

    List<CoreLabel> listeMedCD = CD.tokens();


    for (CoreLabel CL : listeMedCD){

        String navnGjennnkjenner = CL.get(CoreAnnotations.NamedEntityTagAnnotation.class);
        
        System.err.println(CL.originalText()+" " + navnGjennnkjenner); //Med denne kan du se hvordan ord ble klassifistert
        
        if (navnGjennnkjenner.equals("PERSON") && !forbudteOrd.contains(CL.originalText())){ //fordbydte ord må mulig oppdateres med fler pga dette er en engelsk spåkmodell 

            navnliste. add(CL.originalText());


        }else{

            if(navnliste.size()>0){ 

                oppdaterHashmap(navnliste);
                 navnliste.clear();
                
            }

            navnliste.clear();
        }

    //Her tar jeg å legge til i en list frem så lenge klassifiserigen er person, dette finnes som sagt allerde en måte å få hele navn på i CORENLP men
    // med denne måten kan jeg filtere ut forbute ord blant annet når jeg gjør om til token.         


    }   

    //hvis siste token er et navn 
    if(navnliste.size()>0){
                
        oppdaterHashmap(navnliste);
        navnliste.clear();
        
    }

}


private void oppdaterHashmap(ArrayList<String> navnliste){

    String fulltnavn = String.join(" ", navnliste);

    Long count = kart.getOrDefault(fulltnavn, 0L) + 1;

    kart.put(fulltnavn, count);


    }


public Map<String,Long> getkart(){ 
    return kart;
}


public Map<String,Long> GetKartFiltrertBortVersteFeilNorsk(){ //dette gjøres fordi core NLP ifra stanford er forengelsk og ikke norsk, men det er den jeg kan og brukt her. 


    kart = kart
    .entrySet()
    .stream()
    .filter(new HashmapPredicate())
    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    return kart;


}

public static void main (String[] args){

  


}


    
}
