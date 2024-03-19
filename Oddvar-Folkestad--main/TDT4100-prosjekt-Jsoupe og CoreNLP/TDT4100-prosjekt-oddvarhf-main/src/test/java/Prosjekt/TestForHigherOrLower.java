package Prosjekt;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class TestForHigherOrLower {

    private HigherOrLower spillet;

@Before
public void setUp() {
    spillet = new HigherOrLower();
 
    spillet.person1 = new Person("Ola", 5);
    spillet.person2 = new Person("Kari", 10);
}

@Test
public void spillValg1Vinner() {
       
    String resultat = spillet.spill(2);
    assertEquals("Gratulerer! Du gjettet riktig!", resultat);
    assertEquals(1, spillet.getANTALL_POENG());
}

@Test
public void spillValg1Taper() {
        
    String resultat = spillet.spill(1);
    assertEquals("Feil! Du mister et liv.", resultat);
    assertEquals(2, spillet.getAntallLiv()); 
}

@Test
public void spillUavgjort() {
    spillet.person1 = new Person("Ola", 10);
        
    String resultat = spillet.spill(3);
    assertEquals("Gratulerer! Du gjettet riktig!", resultat);
    assertEquals(1, spillet.getANTALL_POENG());
}

@Test
public void spillGameOver() {
        
    for (int i = 0; i < 2; i++) {
        spillet.spill(1); 
    }
    String resultat = spillet.spill(1);
    assertEquals("Game over!", resultat);
    assertEquals(0, spillet.getAntallLiv());
}

}