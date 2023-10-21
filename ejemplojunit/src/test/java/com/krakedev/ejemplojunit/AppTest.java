package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test //convierte el metodo en un test de junit
    public void testSumar () {
     	Calculadora cal = new Calculadora ();
     	int resultado = cal.suma(5, 10);
         assertTrue(resultado==15);

     }
    
    @Test //convierte el metodo en un test de junit
    public void testRestar () {
     	Calculadora cal = new Calculadora ();
     	int resultado = cal.restar(5, 10);
         assertTrue(resultado==-6);

     }

}
