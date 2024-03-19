package Prosjekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class HigherOrLower {

    private final String FILNAVN = "Telt.txt";
    private int ANTALL_LIV;
    private int ANTALL_POENG = 0;

    private List<Person> personer;
    private Random random;
    Person person2;
    Person person1;

public HigherOrLower() {
    
    personer = lesPersonerFraFil(FILNAVN);
    random = new Random();
    this.ANTALL_LIV=3;
   
}

public void oppdater(){

    gjørKlarSpill();

}

private void gjørKlarSpill(){

    personer = lesPersonerFraFil(FILNAVN);
    random = new Random();
    this.ANTALL_LIV=3;

}

public List<Person> lesPersonerFraFil(String filnavn)  {  //leser ifra fil

    List<Person> personer = new ArrayList<>();
    
    try (BufferedReader br = new BufferedReader(new FileReader(filnavn))) {

        String linje;

        while ((linje = br.readLine()) != null) {

            
            String[] linjedeler = linje.split(",");

           

            String navn = linjedeler[0].trim();
    
            int nevntantall = Integer.parseInt(linjedeler[1].trim());

            personer.add(new Person(navn, nevntantall));
            

           
           
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    return personer;
}

public String spill(int valg) {
   
        
if (valg == 1 && person1.getAntallKroner() > person2.getAntallKroner()) {
    ANTALL_POENG++;
    return "Gratulerer! Du gjettet riktig!";
}

if (valg == 2 && person2.getAntallKroner() > person1.getAntallKroner()) {
    ANTALL_POENG++;
    return "Gratulerer! Du gjettet riktig!";
}

if (valg == 3 && person1.getAntallKroner() == person2.getAntallKroner()) {
    ANTALL_POENG++;
    return "Gratulerer! Du gjettet riktig!";
}

    
ANTALL_LIV--;

if (ANTALL_LIV == 0) {

    return "Game over!";
}

return "Feil! Du mister et liv.";
    

    
}

private Person velgTilfeldigPerson() { //Velger en tilfeldig person ut ifra filen
    int index = random.nextInt(personer.size());
    return personer.get(index);
}



public int getAntallLiv() {
    return ANTALL_LIV;
}



public int getANTALL_POENG() {
    return ANTALL_POENG;
}



public String Fåoppgave(){

    this.person1 = velgTilfeldigPerson();
    this.person2 = velgTilfeldigPerson();

    return "Hvem er nevnt flert ganger? "+ person1.getNavn() +" eller " + person2.getNavn();


}




public Person getPerson2() {
    return person2;
}

public Person getPerson1() {
    return person1;
}

    
    
}
