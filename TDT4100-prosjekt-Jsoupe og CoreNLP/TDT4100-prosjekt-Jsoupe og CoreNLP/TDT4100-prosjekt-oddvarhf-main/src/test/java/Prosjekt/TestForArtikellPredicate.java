package Prosjekt;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;



public class TestForArtikellPredicate {


    @Test
public void Test1() throws IOException {

    ArtikkelPredicate AP = new ArtikkelPredicate();

    String relativePathString = "src/test/java/Prosjekt/resources/ForsideNRK.html";
        

    Path relativePath = Paths.get(relativePathString);
        
   
    Path absolutePath = relativePath.toAbsolutePath();

    File ForsideNRK = new File(absolutePath.toString());

    Document doc2 = Jsoup.parse(ForsideNRK, "UTF-8", "", org.jsoup.parser.Parser.xmlParser());


   
    assertFalse(AP.test(doc2));

}



@Test
public void Test2() throws IOException {

    ArtikkelPredicate AP = new ArtikkelPredicate();

    String relativePathString = "src/test/java/Prosjekt/resources/NrkNettside.html";
        

    Path relativePath = Paths.get(relativePathString);
        
   
    Path absolutePath = relativePath.toAbsolutePath();


    File ForsideNRK = new File(absolutePath.toString());

    Document doc2 = Jsoup.parse(ForsideNRK, "UTF-8", "", org.jsoup.parser.Parser.xmlParser());


   
    assertTrue(AP.test(doc2));

}


}
