package com.nicolastrres.exerciciopais;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by nicolastrres on 5/16/16.
 */
public class PaisTest {

    @Test
    public void criarPais() {
        Pais pais = new Pais("Argentina", "Buenos Aires", "2,780,400 km2");
        assertEquals("Argentina", pais.obterNome());
        assertEquals("Buenos Aires", pais.obterCapital());
        assertEquals("2,780,400 km2", pais.obterDimensao());
    }

    @Test
    public void setarNome() {
        Pais pais = new Pais("Argentina", "Buenos Aires", "2,780,400 km2");
        pais.setNome("Brasil");
        assertEquals("Brasil", pais.obterNome());


    }

    @Test
    public void setarCapital() {
        Pais pais = new Pais("Argentina", "Buenos Aires", "2,780,400 km2");
        pais.setCapital("Brasilia");
        assertEquals("Brasilia", pais.obterCapital());

    }
    @Test

    public void testarPaisesIguais(){
        Pais pais = new Pais("Argentina", "Buenos Aires", "2,780,400 km2");
        Pais pais2 = new Pais("Argentina", "Buenos Aires", "2,780,400 km2");
        assertTrue(pais.equals(pais2));

    }

    @Test
    public void testarPaisesDiferentes(){
        Pais pais = new Pais("Argentina", "Buenos Aires", "2,780,400 km2");
        Pais pais2 = new Pais("Argentina", "Brasilia", "2,780,400 km2");
        assertFalse(pais.equals(pais2));

    }
    @Test
   public void setarFronteira(){
        Pais pais = new Pais("Argentina", "Buenos Aires", "2,780,400 km2");
        ArrayList fronteira = new ArrayList();

        fronteira.add("Uruguai");
        fronteira.add("Brasili");
        fronteira.add("Paraguai");

        pais.setFronteira(fronteira);
        assertEquals(fronteira,pais.obterFronteira());




    }


}
