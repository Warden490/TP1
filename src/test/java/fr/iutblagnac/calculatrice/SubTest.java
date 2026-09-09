package fr.iutblagnac.calculatrice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubTest {
    @Test
    void soustraitDeuxNombres() {
        Sub soustraction = new Sub();

        assertEquals(2, soustraction.sub(5, 3));
    }

    @Test
    void produitUnResultatNegatif() {
        Sub soustraction = new Sub();

        assertEquals(-2, soustraction.sub(3, 5));
    }
}