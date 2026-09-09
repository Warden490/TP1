package fr.iutblagnac.calculatrice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTest {
    @Test
    void additionneDeuxNombres() {
        Add calculAddition = new Add();

        assertEquals(5, calculAddition.add(2, 3));
    }

    @Test
    void additionneDeuxNombresNegatifs() {
        Add calculAddition = new Add();

        assertEquals(-5, calculAddition.add(-2, -3));
    }
}