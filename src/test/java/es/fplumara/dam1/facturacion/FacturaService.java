package es.fplumara.dam1.facturacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class FacturaService {

    @Mock
    private Calculadora calculadora{
        when(calculadora.sumar(100, 21)).thenReturn(121)
    }



}
