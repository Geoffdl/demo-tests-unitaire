package fr.diginamic.enumerations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static fr.diginamic.enumerations.Saison.*;

import static org.junit.jupiter.api.Assertions.*;

class SaisonTest
{

    @BeforeEach
    void newTest()
    {
        System.out.println("Nouveau test");
    }

    @Test
    void valueOfLibelle()
    {
        assertAll(() -> assertTrue(Saison.valueOfLibelle("Hiver").equals(HIVER)),
                () -> assertTrue(Saison.valueOfLibelle("Automne").equals(AUTOMNE)),
                () -> assertTrue(Saison.valueOfLibelle("Printemps").equals(PRINTEMPS)),
                () -> assertTrue(Saison.valueOfLibelle("Eté").equals(ETE)));


    }

    @Test
    void valueOfLibelleLimitTesting()
    {
        assertNull(Saison.valueOfLibelle(" "));
        assertNull(Saison.valueOfLibelle("8"));
    }
}