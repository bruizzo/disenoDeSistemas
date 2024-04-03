package domain;

import org.junit.Assert;
import org.junit.Test;

public class MateriaTest {

    @Test
    public void MateriaEsCorrelativaConOtra() {

        Materia unaMateria = new Materia("diseñoDeSistemas");
        Materia otraMateria = new Materia("analisisDeSistemas");
        unaMateria.agregarMateriasCorrelativas(otraMateria);

        Assert.assertTrue(otraMateria.esCorrelativa(unaMateria));
    }
}
