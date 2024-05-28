package com.example.exemplo_actions.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
@org.springframework.stereotype.Service
public class CalculadoraService {
    public double dividir(double a, double b){
        if (b==0){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Divisão por zero não permitida");
        }
        return  a/b;
    }
}
