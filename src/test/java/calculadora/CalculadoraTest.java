package calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.CalculadoraCreate;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setup(){
        calculadora = CalculadoraCreate.create();
    }

    //Nunca fazer IF dentro do teste, caso tenha mais de uma opcao para testar crie um novo teste para testar aquela situacao
    @Test
    @DisplayName("Valida parmetros diferentes de zero")
    void dividir_ReturnValueDouble_WhenParamDifferentZero() {
        double expected = CalculadoraCreate.create().getN1() / CalculadoraCreate.create().getN2();

        double resultado  = calculadora.dividir();

        Assertions.assertEquals(expected, resultado);
    }

    @Test
    @DisplayName("Valida parmetros com denominador zero")
    void dividir_ReturnValueDouble_WhenParamEqualZero() {
        double expected = 0;
        calculadora = CalculadoraCreate.createWithZero();
        double resultado  = calculadora.dividir();

        Assertions.assertEquals(expected, resultado);
    }

}