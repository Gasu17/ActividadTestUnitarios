package es.fplumara.dam1.operaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class testmedia {


    // PARAMETRIZADO - assertEquals
    @DisplayName("TestParametrizado")
    @ParameterizedTest
    @MethodSource("notas")
    void testMedia (double[] notas , Double resultado){
        Double resultadoEsperado = Operaciones.media(notas);
        assertEquals (resultadoEsperado , resultado,0.0001);
    }

    //assertAll
    @DisplayName("Test usandro assertAll")
    @Test
    void testmediaassertall (){
    assertAll (
            () -> assertEquals(5.0, Operaciones.media(5,5,5), 000.1, "No es la media esperada "),
            () -> assertEquals(6.0, Operaciones.media(7,5,6), 000.1, "No es la media esperada"),
            () -> assertEquals(3.0, Operaciones.media(3,3,3), 000.1, "No es la media esperada")
    );
    }


    // asserThrows
    @Nested
    @DisplayName("Test de errores")
    @Test
    void mediaSinArgumento (){
        assertThrows(IllegalArgumentException.class,
                () -> Operaciones.media()

                );

    }
    // assertThrows
    @Test
    void mediaConNull (){
        assertThrows(IllegalArgumentException.class,
                () -> Operaciones.media((double[])  null));

    }
    // ----------------------------------------------------------------------------

// Datos del MethodSource
    static Stream<Arguments> notas() {
        return Stream.of(
                Arguments.of(new double[]{5, 5, 5}, 5.0),
                Arguments.of(new double[]{10, 0}, 5.0),
                Arguments.of(new double[]{7, 9}, 8.0),
                Arguments.of(new double[]{1, 2, 3, 4}, 2.5)

        );
    }
}
