package com.example.exemplo_actions.Service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {
    @Test
    @DisplayName("Quando adicionado 10 e 2, deve retornar 5")
    public void testDividir(){
        CalculadoraService calculadoraService = new CalculadoraService();
        double a = 10;
        double b= 2;
        double esperado = 5;

        double resultado = calculadoraService.dividir(a, b);
        assertEquals(esperado, resultado);
    }
}