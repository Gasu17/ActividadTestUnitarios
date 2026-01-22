package es.fplumara.dam1.operaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testmedia {

    @ParameterizedTest
    @MethodSource("notas")

    void testMedia (double[] notas , Double resultado){
        Double resultadoEsperado = Operaciones.media(notas);
        assertEquals (resultadoEsperado , resultado,0.0001);
    }


    static Stream<Arguments> notas() {
        return Stream.of(
                Arguments.of(new double[]{5, 5, 5}, 5.0),
                Arguments.of(new double[]{10, 0}, 5.0),
                Arguments.of(new double[]{7, 9}, 8.0),
                Arguments.of(new double[]{1, 2, 3, 4}, 2.5)

        );
    }
}
