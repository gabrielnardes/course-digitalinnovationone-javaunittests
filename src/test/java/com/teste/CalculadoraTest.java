package com.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void somar() {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar("1+1+3");
        assertEquals(5, soma);
    }
}