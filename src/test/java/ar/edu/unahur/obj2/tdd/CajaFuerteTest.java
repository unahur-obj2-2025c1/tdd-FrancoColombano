package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CajaFuerteTest {
    @Test
    public void cajaFuerteDebeEstarAbiertaAlCrearse(){
        CajaFuerte caja = new CajaFuerte();
        assertTrue(caja.estaAbierta());
    }

    @Test
    public void alIngresarCodigoLaCajaSeCierra(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        assertFalse(caja.estaAbierta());
    }

    
    @Test
    public void laCajaPuedeEstablecerNuevoCodigoSoloSiEstaAbierta(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        assertFalse(caja.estaAbierta());
        caja.cerrar(4567);
        caja.abrir(4567);
        assertFalse(caja.estaAbierta());
    }

    @Test
    public void alIngresarCodigoCorrectoLaCajaSeAbre(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        assertFalse(caja.estaAbierta());
        caja.abrir(1234);
        assertTrue(caja.estaAbierta());
    }

    @Test void alIngresarCodigoIncorrectoLaCajaNoSeAbre(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        assertFalse(caja.estaAbierta());
        caja.abrir(4567);
        assertFalse(caja.estaAbierta());
    }
}
