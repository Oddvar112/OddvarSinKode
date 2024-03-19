package Prosjekt;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void constructorShouldSetFieldsCorrectly() {
        String expectedNavn = "Ola Nordmann";
        int expectedAntallKroner = 100;

        Person person = new Person(expectedNavn, expectedAntallKroner);

        assertAll(

            () -> assertEquals(expectedNavn, person.getNavn()),
            () -> assertEquals(expectedAntallKroner, person.getAntallKroner())

        );
    }
}