package org.dis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    Calculadora cal;
    double a;
    double b;
    @BeforeEach
    public void init() {
        cal = new Calculadora();
        a = 4;
        b = -2;
    }

    @Test
    @DisplayName("Test método sumar (double, double")
    public void testSumar() {
        //Arrange
        Calculadora cal=new Calculadora(); //Act
        double suma=cal.sumar(4,-2); //Assert
        assertEquals(2,suma);
    }
    @Test
    @DisplayName("Test método restar (double, double")
    public void testRestar() {
        Calculadora cal = new Calculadora();
        assertEquals(6, cal.restar(a,b));
    }
    @Test
    @DisplayName("Test método dividir (double, double")
    public void testDividir() {
        Calculadora cal = new Calculadora();
        assertEquals(6, cal.dividir(a,b));
    }
    @Test
    @DisplayName("Test método multiplicar (double, double")
    public void testMultiplicar() {
        Calculadora cal = new Calculadora();
        assertEquals(-8, cal.multiplicar(a,b));
    }
}

