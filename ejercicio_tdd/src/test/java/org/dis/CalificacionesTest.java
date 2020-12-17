package org.dis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalificacionesTest {
    double a;
    String b;
    @Test
    @DisplayName("Test método iguales (double, double")
    public void testIguales() {
        Calificaciones cal = new Calificaciones();
        assertTrue(cal.Esigual(a,b));
    }
}
