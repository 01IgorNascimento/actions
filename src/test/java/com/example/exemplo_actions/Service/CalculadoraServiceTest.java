package com.example.exemplo_actions.Service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.server.ResponseStatusException;

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
    @Test
    @DisplayName("Quando adicionar 10 e 0 deve aparecer uma ecessão")
    public void testeDividirPorzero(){
        CalculadoraService calculadoraService = new CalculadoraService();
        double a = 10;
        double b = 0;
        var expectedMessage = "400 BAD REQUEST \"Divisão por zero não permitida\"";
        ResponseStatusException exception = assertThrows(
                ResponseStatusException.class, ()-> {
                    calculadoraService.dividir(a,b);
                });
        assertEquals(expectedMessage, exception.getMessage());
    }
}