package fr.iutblagnac.calculatrice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTest {
    @Test
    void additionneDeuxNombres() {
        Add addition = new Add();

        assertEquals(5, addition.add(2, 3));
    }
}