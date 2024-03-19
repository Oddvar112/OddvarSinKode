package Prosjekt;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;



public class TestNLPTester {

@Before
public void Oppsett() {

}


@Test
public void testMedSetning1() {

    String test1 = "Erik og Maria Pedersen gikk en tur i Oslo. Maria Pedersen spiste en is";

    TestNLP NLP1 = new TestNLP(test1);
    Map<String, Long> ForventetMap = new HashMap<>();

    ForventetMap.put("Maria Pedersen", 2L);

    Map<String, Long> Map = NLP1.GetKartFiltrertBortVersteFeilNorsk();

    assertEquals(ForventetMap, Map);
    
    }

@Test
public void testMedSetning2() {

    String test2 = "Hanne Lier og Ole planlegger en ferie til Lofoten neste sommer. Hanne Lier sin lillebror heter også Hanne Lier.";

    TestNLP NLP2 = new TestNLP(test2);

    Map<String, Long> ForventetMap = new HashMap<>();

    ForventetMap.put("Hanne Lier", 3L);

    Map<String, Long> Map = NLP2.GetKartFiltrertBortVersteFeilNorsk();

    assertEquals(ForventetMap, Map);

}

    
@Test
public void testMedSetning3() {

    String test3 = "Nora Eliasen tok med seg hunden  til parken i går. Nora Eliasen sin hund het Ole Pettersen, Nora Eliasen elsekt hunden sin Ole Pettersen.";

    TestNLP NLP3 = new TestNLP(test3);

    Map<String, Long> ForventetMap = new HashMap<>();

    ForventetMap.put("Nora Eliasen", 3L);
    ForventetMap.put("Ole Pettersen", 2L);

    Map<String, Long> Map = NLP3.GetKartFiltrertBortVersteFeilNorsk();

    assertEquals(ForventetMap, Map);

}


@Test
    public void testMedSetning4() {

    String test4 = "Jens Stoltenberg møtte Erna Solberg for diskusjoner i Oslo. Hvem vinner Erna Solberg eller Jens Stoltenberg";
    TestNLP NLP4 = new TestNLP(test4);
    Map<String, Long> ForventetMap = new HashMap<>();

    ForventetMap.put("Jens Stoltenberg", 2L);
    ForventetMap.put("Erna Solberg", 2L);

    Map<String, Long> Map = NLP4.GetKartFiltrertBortVersteFeilNorsk();
    assertEquals(ForventetMap, Map);

    }


    
@Test
public void testMedSetning5() {

String test5 = "Alexander Rybak vant Eurovision med sangen Fairytale. Alexander Rybak synger";

TestNLP NLP5 = new TestNLP(test5);

Map<String, Long> ForventetMap = new HashMap<>();     

ForventetMap.put("Alexander Rybak", 2L);  

Map<String, Long> Map = NLP5.GetKartFiltrertBortVersteFeilNorsk();
assertEquals(ForventetMap, Map);

}


@Test
public void testMedSetning6() {

String test6 = "Sofie Wang elsker bøkene skrevet av Jo Nesbø. Jo Nesbø elsker ikke bøkene til Sofie Wang";
TestNLP NLP6 = new TestNLP(test6);
Map<String, Long> ForventetMap = new HashMap<>();

ForventetMap.put("Jo Nesbø", 2L); 
ForventetMap.put("Sofie Wang", 2L); 
        
Map<String, Long> Map = NLP6.GetKartFiltrertBortVersteFeilNorsk();
assertEquals(ForventetMap, Map);

    }


@Test
public void testMedSetning7() {

String test7 = "Henrik Ibsen skrev Et dukkehjem og det  regnes som et viktig verk i norsk litteratur."+ 
"Boken 1984 falt mer i smak hos Oddvar Hanevik Folkestad. Henrik Ibsen er ikke en favoritt hos Oddvar Hanevik Folkestad";

TestNLP NLP7 = new TestNLP(test7);

Map<String, Long> ForventetMap = new HashMap<>();


ForventetMap.put("Oddvar Hanevik Folkestad", 2L); 
ForventetMap.put("Henrik Ibsen", 2L); 
  
Map<String, Long> Map = NLP7.GetKartFiltrertBortVersteFeilNorsk();
assertEquals(ForventetMap, Map);



}
@Test
public void testMedSetning8() {

String test8 = "Magnus Carlsen deltok i sjakkturneringen i Stavanger. Magnus Carlsen vant";

TestNLP NLP8 = new TestNLP(test8);

Map<String, Long> ForventetMap = new HashMap<>();

ForventetMap.put("Magnus Carlsen", 2L); 
    
Map<String, Long> Map = NLP8.GetKartFiltrertBortVersteFeilNorsk();

assertEquals(ForventetMap, Map);

}

@Test
public void testMedSetning9() {

String test9 = "John and Mary went to the park yesterday.";

TestNLP NLP9 = new TestNLP(test9);

Map<String, Long> ForventetMap = new HashMap<>();

ForventetMap.put("John", 1L); 
ForventetMap.put("Mary", 1L); 
   
Map<String, Long> Map = NLP9.getkart();


assertEquals(ForventetMap, Map);

}

@Test
public void testMedSetning10() {
    String test10 = "Elon Musk and Jeff Bezos are competing in the space industry. Will Elon Musk win?";
    TestNLP NLP10 = new TestNLP(test10);
    Map<String, Long> ForventetMap = new HashMap<>();
   
    ForventetMap.put("Will Elon Musk", 1L); //Her kan du se et eksmpel på en feil man kan få. 
    ForventetMap.put("Jeff Bezos", 1L); 
    ForventetMap.put("Elon Musk", 1L);
    
    Map<String, Long> Map = NLP10.getkart();
    assertEquals(ForventetMap, Map);
}


@Test
public void testMedSetning12() {
    String test12 = "Taylor Swift released a new album last week. Taylor Swift is cool, Taylor Swift writes songs.";

    TestNLP NLP12 = new TestNLP(test12);

    Map<String, Long> ForventetMap = new HashMap<>();
    
    ForventetMap.put("Taylor Swift", 3L);

    Map<String, Long> Map = NLP12.GetKartFiltrertBortVersteFeilNorsk();
    assertEquals(ForventetMap, Map);

}

@Test
public void testMedSetning13() {
    String test13 = "The movie starred Leonardo DiCaprio and Kate Winslet as the main characters. Leonardo DiCaprio and Kate Winslet are actors ";
    
    TestNLP NLP13 = new TestNLP(test13);

    Map<String, Long> ForventetMap = new HashMap<>();
   
    ForventetMap.put("Leonardo DiCaprio", 2L);
    ForventetMap.put("Kate Winslet", 2L);
   
    

    Map<String, Long> Map = NLP13.GetKartFiltrertBortVersteFeilNorsk();

    assertEquals(ForventetMap, Map);
}

@Test
public void testMedSetning14() {
    String test14 = "Emma Watson is known for her role in the Harry Potter series.";

    TestNLP NLP14 = new TestNLP(test14);

    Map<String, Long> ForventetMap = new HashMap<>();
   

    Map<String, Long> Map = NLP14.GetKartFiltrertBortVersteFeilNorsk();
    assertEquals(ForventetMap, Map);
}

@Test
public void testMedSetning15() {
    String test15 = "Barack Obama was the 44th president of the United States. Barack Obama was the 44th president of the United States. Barack Obama was the 44th president of the United States.";

    TestNLP NLP15 = new TestNLP(test15);

    Map<String, Long> ForventetMap = new HashMap<>();

    ForventetMap.put("Barack Obama", 3L);

    Map<String, Long> Map = NLP15.GetKartFiltrertBortVersteFeilNorsk();
    assertEquals(ForventetMap, Map);
}








    
}
