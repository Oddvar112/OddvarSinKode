package Prosjekt;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class URLTilFilTest {

@Test
public void konstruktorSkalSetteNettsideTilNRKForNRKUrl() {
    String nrkUrl = "https://www.nrk.no/toppsaker.rss";
    URLTilFil urlTilFil = new URLTilFil(nrkUrl);
    Assertions.assertEquals("NRK", urlTilFil.getNettside());
}

@Test
public void konstruktorSkalSetteNettsideTilWIKIForWikipediaUrl() {
    String wikiUrl = "https://no.wikipedia.org/wiki/Norge";
    URLTilFil urlTilFil = new URLTilFil(wikiUrl);
    Assertions.assertEquals("WIKI", urlTilFil.getNettside());
}

@Test
public void konstruktorSkalKasteIllegalArgumentExceptionForUgyldigUrl() {
    String ugyldigUrl = "dette er ikke en url";
    Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
        new URLTilFil(ugyldigUrl);
    });

    Assertions.assertTrue(exception.getMessage().contains("Ugyldig URL"));
}

  @Test
    public void observerShouldBeNotifiedWithMockito() {


        // Opprett en mock for LagretiFilObserver
        LagretiFilObserver mockObserver = mock(LagretiFilObserver.class);
      
        URLTilFil urlTilFil = new URLTilFil("https://example.com");

        urlTilFil.addObserver(mockObserver);

        urlTilFil.notifyObservers();

        // Verifiser at startSpill-metoden ble kalt på mock-observatøren
        verify(mockObserver).startSpill();
    }



}
 
    

