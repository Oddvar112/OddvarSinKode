package Prosjekt;

import static org.junit.Assert.*;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;





public class TestScraper {


String tekstNrk= "Åtte år med lovnader om sunnere mat: Mener matbransjen er en fiende av folkehelsa Sia 2016 har ulike regjeringer samarbeida med den norske matbransjen for å gjøre maten vår sunnere. Men resultatet har ikke vært helt som håpa. Saken oppsummert Ekspander/minimer faktaboks Sia 2016 har norske myndigheter samarbeida med matbransjen for å gjøre maten sunnere. Til tross for intensjoner om sunnere mat, spiser vi mindre fisk og frukt, og får fortsatt i oss for mye salt. Sukkerinnholdet i maten har ikke endret seg mye. NTNU-professor Steinar Krokstad mener at matbransjen er en fiende av folkehelsa, da de selger det som lønner seg, uavhengig av helseeffekter. Matbransjen er uenige i kritikken, og sier de gjør mye for å nå måla i intensjonsavtalen for et sunnere kosthold. Oppsummeringa er laga av en KI-tjeneste fra OpenAi. Innholdet er kvalitetssikra av NRKs journalister før publisering. Handleturen er snart over. Oppi vogna ligger melk, kjøttdeig og alt det andre som sto på lista di. I det du nærmer deg kassa må du forbi butikkens siste fristelser. Store sjokoladeplater på tilbud. Ta tre, betal for to! Smågodtet er plassert rett ved siden av isen. Det skal godt gjøres å stå imot. Men målet for samarbeidet mellom myndighetene og de som lager og selger maten er faktisk at du skal stå imot. For det skal bli «enklere for forbrukeren å ta sunnere valg», oppsummerer Helsedirektoratet. En studie viser at unge nordmenn sliter med å forstå hvilken mat som er sunn. – Selger det som lønner seg Men til tross for åtte år med intensjoner spiser vi mindre fisk, mindre frukt og bær og fortsatt får i oss for mye salt. Sukkerinnholdet i maten har ikke endra seg stort. Det samme gjelder metta fett og bruk av grovt mjøl og grønnsaker. – Resultatet er klart. Det går i feil retning, sier NTNU-professor Steinar Krokstad. Han er tydelig på hvorfor det er sånn. Professor Steinar Krokstad mener kostholdet vårt kunne vært helt annerledes om matbransjen faktisk tok ansvar. Foto: Sverre Lilleeng / NRK – Vi har et næringsliv som ikke skiller mellom helsebringende og helseskadelige varer, og selger det som lønner seg. Da er du en fiende av folkehelsa. Nå er snart to tredjedeler av befolkninga overvektige. Og snart en fjerdedel av voksne har fedme. Hadde vi klart å følge kostholdsråda, kunne samfunnet spart over 154 milliarder kroner per år, ifølge ei beregning fra 2017. I Chile har åttekanta svarte merker påvirka hva folk putter i handlekurven: Les også Her merker de usunn mat – det har endra hva folk kjøper – Bryr seg lite om hva folk spiser Krokstad satt i ei ekspertgruppe som rett etter nyttår ga myndighetene nye råd om hva som bør gjøres for å bedre kostholdet vårt. Her snakker han bare på vegne av seg sjøl som forsker på folkehelse. Ekspertgruppa forslo blant annet å skru opp avgiftene på drikke med tilsatt sukker, gi gratis frukt og grønt til barn i skolen og innføre skikkelig merking av maten vår. Krokstad mener matbransjen, både butikkene og industrien, har sluppet for billig unna. – De vil jo selge hva som helst for å øke omsetninga og bryr seg lite om hva folk spiser. Det er lett å ryke på en sjokoladesmell i butikken. Foto: Simon Skjelvik Brandseth / NRK For de har store mulighet til å påvirke oss gjennom reklame og måten de tilbyr varer på i butikkene. – Dessverre har jeg ingen tillit til at de som selger matvarer egentlig har noen intensjon om å hjelpe til med folkehelsespørsmålene. Professoren trur det må sterkere lut til for å få matbransjen til å bidra til et sunnere kosthold. – Jeg tror at det rett og slett må få konsekvenser for dem økonomisk, hvis de ikke følger opp intensjonsavtalen. For ellers, som det er i dag, gjør de egentlig som de vil. Matkjedene sier de bruker fine grønnsakdisker for å få kundene til å kjøpe sunnere mat. Foto: Simon Skjelvik Brandseth / NRK Verken de som produserer maten eller dagligvarekjedene kjenner seg igjen i kritikken fra professoren, eller i påstanden om at de er fiender av folkehelsa. Les hva de sier lenger ned i saken. Ny studie om ultraprosessert mat: – Vi må ta denne forskninga på største alvor Les også Ny studie knytter ultrabehandlet mat til 32 alvorlige helsetilstander Møter og workshops Spesialrådgiver Ole Berg i Helsedirektoratet sier at matbransjen har jobba tett med myndighetene etter at den første avtalen blei inngått i 2016. De har vært med på møter og stilt opp på workshops og så videre. Noen har jobba med å endre oppskriftene på varene de selger, eller gjort andre grep i butikkene. Samtidig sier han at direktoratet veit at det er kommersielle interesser som næringslivet tar hensyn til. – De gjør jo valg som ikke alltid er til det beste for folkehelsa. Men sånn må det kunne være i et fritt marked. Over 60 prosent av brusen som selges i Norge er uten sukker. Berg innrømmer myndighetene og næringslivet ikke har nådd de målene som de har satt seg, sjøl om det er gjort mye godt arbeid. – Så det kan tyde på at man også trenger andre virkemidler for å oppnå dem. Les også Brukte flere millioner på å få oss til å spise sunnere. Men Marius sverger til boller og Redbull Avgift på sukkerdrikke Petter Brubakk i NHO Mat og drikke er stolt av samarbeidet som industrien har med myndighetene. – Jeg tror ikke du vil finne noe annet europeisk land hvor myndigheter og næringslivet jobber så tett og nært for å få til gode resultater. – Dere blir kalt fiender av folkehelsa. Hva sier du til det? – Den måten å karakterisere en seriøst arbeidende industri er veldig unyansert, og lite byggende for en god debatt om åssen vi sikrer bedre folkehelse, svarer Brubakk. Peter Brubakk i NHO Mat og drikke sier mange bedrifter stadig prøver å utvikle nye produkter, eller gjøre det de allerede lager litt sunnere. Foto: NRK – De som produserer drikker har sørget for at det nå finnes stort sett sukkerfrie varianter innenfor enhver drikkevare du ønsker deg, fortsetter han. I tiåret før intensjonsavtalen blei inngått stupte sukkerforbruket i Norge. Sia 2016 har nedgangen flata ut. Men Brubakk vil ikke ha noen ny avgift på sukkerdrikke, sjøl om det blir anbefalt av både Verdens helseorganisasjon og det norske ekspertutvalget. – Vi har jo prøvd avgiftsvirkemiddelet. Alle de utfordringene vi har med folkehelsa og kosthold i dag, har altså oppstått mens vi hadde avgifter. Han legger også en del av ansvaret på forbrukerne. – Det er utvikla mange produkter som dessverre har bare blitt i hyllene i noen uker eller måneder, fordi ikke tilstrekkelig mange ville ha dem. Salget av helmjølk øker, på tross av nasjonale råd om å spise magre meieriprodukter. Bli med på mjølkeruta her. Bra med kunder som lever lenge Hos Coop sier Ingvill Størksen at de er klar over at de har en viktig rolle å spille. Og hun er klar over at ikke målene i intensjonsavtalen er nådd ennå. – Samtidig er det jo også sånn at rollen vår er ikke å nekte folk å kjøpe det de vil ha. Ingvill Størksen i Coop mener utviklinga i nordmenns kosthold kunne vært verre hvis næringslivet ikke samarbeida med myndighetene. Foto: Espen Solli – Det å ha sunne kunder som lever lenge, det er jo bra både for oss og for kunden, for å si det sånn. Hun forklarer tilbudene de har på fire sjokoladeplater til under hundrelappen, eller pakninger på åtte store brus, med konkurranse. – Vi er nødt til å gjøre det vi kan for å få kundene inn i vår butikk. Når kundene er i vår butikk «nudger» vi også sunnere valg. Men vi skal jo ikke bestemme hva kundene skal velge. Nordmenn bruker millioner av egen lomme for å kjøpe slankemedisiner. Men det er ikke alle som har råd, så sprøytene gjør flere avhengige sosialhjelp.";
String tekstWiki = "Trond Fausa Aurvåg (born 2 December 1972) is a Norwegian actor, film director, and poet. After graduating from the Norwegian National Academy of Theatre in 2001, he has acted at Oslo Nye Teater since 2001.[2] Here he has acted in plays such as Amadeus, Manndomsprøven and Tatt av kvinnen.[3] As a film actor he is best known for his leading roles in the films Andreaskorset (2004) and Den brysomme mannen (2006).[4] He has also starred in the music video for Lemaitre's song \"We Got U\".[5] He won two Amandas—the main Norwegian film award—in 2006, for best actor for his role in Den brysomme mannen, and for the short film Alene menn sammen, which he directed.[6] He gained some international attention co-starring with Steven Van Zandt in the TV series Lilyhammer, playing Van Zandt's partner in crime. For this role he won the Gullruten Award in 2014 for best actor.[7] He plays a role in Christopher Nolan's film, Oppenheimer, where he portrays the Ukrainian scientist George Kistiakowsky.[8] Aurvåg lives with his wife, actress Lena Kristin Ellingsen, in Oslo.[2] Budbringeren (1997) 1732 Høtten (1998) Nissene på låven (TV, 2001) Andreaskorset (2004) Den brysomme mannen (2006) Tatt av kvinnen (2007) Home for Christmas (2010) Lilyhammer (2012) Neste Sommer [no] (2014) Jul i Blodfjell [no] (2017) Thin Ice (2017)[9] Norsemen (2017) The Innocents (2018) Stjernestøv [no] (TV, 2020) The Middle Man (2021) Oppenheimer (2023) Captain Fall (2023) Trond Fausa Aurvåg at IMDb Trond Fausa at Instagram ";
String tekstWikitabel = "Twelve people have walked on Earth's Moon. The first one was Neil Armstrong and the last one was Harrison Schmitt. All crewed moon landings took place between July 1969 and December 1972 as part of the United States Apollo program. All twelve people who have walked on the Moon are American men. List of Apollo astronauts Pictures No. NAME MISSION BORN DIED Lunar EVA dates (UTC)[2] Lunar EVAs[2] Total EVA duration[2] Astronaut service 1. Neil Armstrong Apollo (1930-08-05)August 5, 1930[3] August 25, 2012(2012-08-25) (aged 82) July 21, 1969[a] hours minutes NASA[b] 2. Buzz Aldrin Apollo January 20, (age 94)[4] July 21, 1969[a] hours minutes Air Force 3. Pete Conrad Apollo (1930-06-02)June 2, 1930[5] July 8, 1999(1999-07-08) (aged 69) November 19–20, hours minutes Navy 4. Alan Bean Apollo (1932-03-15)March 15, 1932[6] May 26, 2018(2018-05-26) (aged 86) November 19–20, hours minutes Navy 5. Alan Shepard Apollo (1923-11-18)November 18, 1923[7] July 21, 1998(1998-07-21) (aged 74) February 5–6, hours minutes Navy 6. Edgar Mitchell Apollo (1930-09-17)September 17, 1930[8] February 4, 2016(2016-02-04) (aged 85) February 5–6, hours minutes Navy 7. David Scott Apollo June 6, (age 91)[9] July 31–August 2, hours minutes Air Force 8. James Irwin Apollo (1930-03-17)March 17, 1930[10] September 8, 1991(1991-09-08) (aged 61) July 31–August 2, hours minutes Air Force 9. John Young Apollo (1930-09-24)September 24, 1930[11] January 5, 2018(2018-01-05) (aged 87) April 21–23, hours minutes Navy 10. Charles Duke Apollo October 3, (age 88)[12] April 21–23, hours minutes Air Force 11.[c] Gene Cernan Apollo (1934-03-14)March 14, 1934[13] January 16, 2017(2017-01-16) (aged 82) December 11–14, hours minutes Navy 12. Harrison Schmitt Apollo July 3, (age 88)[14] December 11–14, hours minutes NASA";
String tekstnettside = "Words This is a web page. There's not much here. Just words. And you're reading them. We've become obsessed with fancy designs, responsive layouts, and scripts that do magical things. But the most powerful tool on the web is still words. I wrote these words, and you're reading them: that's magical. I'm in a little city in British Columbia; you're probably somewhere else. I wrote this early in the morning, June 20th, 2013; you're reading it at a different time. I wrote this on my laptop; you could be reading this on your phone, a tablet or a desktop. You and I have been able to connect because I wrote this and you're reading it. That's the web. Despite our different locations, devices, and time-zones we can connect here, on a simple HTML page. I wrote this in a text editor. It's 6 kB. I didn't need a Content Management System, a graphic designer, or a software developer. There's not much code on this page at all: just simple markup for paragraphs, hierarchy, and emphasis. I remember teaching my daughter to code HTML when she was 8. The first thing she wrote was a story about a squirrel. She wasn't \"writing HTML\"; she was sharing something with the world. She couldn't believe that she could write a story on our home computer, and then publish it for the world to see. She didn't care about HTML; she cared about sharing her stories. You are still reading. Think about all the things you could communicate with a simple page like this. If you're a businessperson, you could sell something. If you're a teacher, you could teach something. If you're an artist, you could show something you've made. And if your words are good, people will read them. If you're a web designer, I challenge you to think about the words first. Instead of starting with a style guide or a Photoshop mockup, start with words on a page. What do you have to say? If you don't know, there's not much use in adding all that other cruft. Just start with one page, with a single focus. Write it and publish it, and then iterate on that. Every time you're about to add something, ask yourself: does this help me communicate better? Will that additional styling, image, or hyperlink give my audience more understanding? If the answer is \"no,\" don't add it. At its heart, web design should be about words. Words don't come after the design is done. Words are the beginning, the core, the focus. Start with words. Cheers, Justin Jackson @mijustin Do you like to make stuff on the web? Subscribe to my newsletter. I also like creating podcasts. Translations Arabic – thanks to Muayyad Jesry Slovenian – thanks to Leon Škrilec Catalan – thanks to Jordi Nebot Afrikaans – thanks to Leo Gopal Brazilian Portuguese – thanks to Heitor Belloni Chinese – thanks to Zhuangda Zhu Czech – thanks to Jan Hajek Danish – thanks to Anders Gerlev Hansen Dutch – thanks to Frank Schaap Filipino – thanks to Nearamos French – thanks to PLMD and Alexis Kauffmann German – thanks to Yannick Ihmels and David Lucas Greek – thanks to Yiannis Konstantakopoulos Hebrew – thanks to Shachaf Rodberg Hungarian – thanks to Hüperión Fordítói Műhely Indonesian - thanks to Darmawan Italian – thanks to Pixline Japanese – thanks to Elle Kasai Korean – thanks to Hong Minhee Maltese – thanks to Vanessa Galea Mongolian – thanks to Ocho Persian – thanks to Kamyar Polish – thanks to Gregory Wolanski Romanian – thanks to Lucian Pricop Russian – thanks to Ярослав Wебком Spanish – thanks to Ramón García-Pérez Swedish – thanks to Erik Stattin Turkish – thanks to Opereyşın Vietnamese – thanks to Nam Quach";

@Before
public void Oppsett() {
    
}

@Test
public void TestScraperScraper() throws IOException {

String relativePathString = "src/test/java/Prosjekt/resources/nettside4.html";

Path relativePath = Paths.get(relativePathString);
        
Path absolutePath = relativePath.toAbsolutePath();

File nettside  = new File(absolutePath.toString()); 

Document doc = Jsoup.parse(nettside, "UTF-8", "", org.jsoup.parser.Parser.xmlParser());    

Scraper scraper= new Scraper("https://justinjackson.ca/words.html");

String text = scraper.fåAllTekst(doc);

assertEquals(text,tekstnettside);

}



 

@Test
public void TestNettsideNRK() throws IOException {

//bruker en nedlastet verjon av en RSS feed fordi  metode jsoupe.get er statisk. 

String relativePathString = "src/test/java/Prosjekt/resources/nrkRssFeedExample.html";
        

Path relativePath = Paths.get(relativePathString);
        
   
Path absolutePath = relativePath.toAbsolutePath();

File FakenettsideRss  = new File(absolutePath.toString()); 
Document doc = Jsoup.parse(FakenettsideRss, "UTF-8", "", org.jsoup.parser.Parser.xmlParser());

NRKScraper scraper = new NRKScraper("https://www.nrk.no/toppsaker.rss");
ArrayList<String> AL = scraper.fåAlleLinkerRss(doc);

assertEquals(2, AL.size());

assertTrue("Listen inneholder ikke elementet", AL.contains("https://www.nrk.no/nordland/xl/faren-til-19-aringen-etter-sorfold-drapene_-vet-ikke-hvordan-de-skulle-klart-seg-uten-kriseteamene-1.16763373"));
assertTrue("Listen inneholder ikke elementet", AL.contains("https://www.nrk.no/trondelag/matbransjen-lova-a-gjore-norske-matvaner-sunnere_-_-utviklinga-gar-i-feil-retning-1.16730850"));

relativePathString = "src/test/java/Prosjekt/resources/NrkNettside.html";
        

relativePath = Paths.get(relativePathString);
        
   
absolutePath = relativePath.toAbsolutePath();

File FakeNrkArtikkel = new File(absolutePath.toString());
Document doc2 = Jsoup.parse(FakeNrkArtikkel, "UTF-8", "", org.jsoup.parser.Parser.xmlParser());

String text = scraper.fåAllTekst(doc2);


assertEquals(text,tekstNrk);


}


@Test
public void TestNettsidewiki() throws IOException {

    WikiScraper scraper = new WikiScraper("https://en.wikipedia.org/wiki/Trond_Fausa_Aurv%C3%A5g");

    String relativePathString = "src/test/java/Prosjekt/resources/nettside.html";
        

    Path relativePath = Paths.get(relativePathString);
        
   
    Path absolutePath = relativePath.toAbsolutePath();

    File FakeNrkArtikkel = new File(absolutePath.toString());

    Document doc2 = Jsoup.parse(FakeNrkArtikkel, "UTF-8", "", org.jsoup.parser.Parser.xmlParser());

    String text = scraper.fåAllTekst(doc2);
    
   
    
    assertEquals(text,tekstWiki);
    
}

@Test
public void TestNettsideMedWikitabel() throws IOException{


    WikiScraper scraper = new WikiScraper("https://simple.wikipedia.org/wiki/List_of_people_who_have_walked_on_the_Moon");

    String relativePathString = "src/test/java/Prosjekt/resources/nettside3.html";
        

    Path relativePath = Paths.get(relativePathString);
        
   
    Path absolutePath = relativePath.toAbsolutePath();
  

    File FakeNrkArtikkel = new File(absolutePath.toString());



    Document doc2 = Jsoup.parse(FakeNrkArtikkel, "UTF-8", "", org.jsoup.parser.Parser.xmlParser());

    String text = scraper.fåAllTekst(doc2);
    
   
    
    assertEquals(text,tekstWikitabel);



}

    
}
