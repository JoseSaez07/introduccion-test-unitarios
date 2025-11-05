package es.fpsumma.dam1.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberUtilsTest {
@Test
    public void sumaOK() {
        int resultado = NumberUtils.suma(2, 3);
        assertEquals(5, resultado);
    }


@Test
public void divisionOk() {
double resultado = NumberUtils.division(4, 2);
assertEquals(2, resultado);
    }
}
@Test
public void isEvenOk() {
double resultado = NumberUtils.isEven(2);
(2, resultado);
}

 