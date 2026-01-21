package es.fplumara.dam1.operaciones;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperacionesTest {


    @ParameterizedTest
    @CsvSource({
            "1, INSUFICIENTE",
            "0.01 , NOTABLE ",
            "10.01 , SOBRESALIENTE"

    })

    @DisplayName("Comprueba las notas ")
    public void calificacionNotasValidas (double nota, String resultadoEsperado){
        String resultado = Operaciones.calificacion(nota);
        assertEquals (resultado ,resultadoEsperado );
    }
}
