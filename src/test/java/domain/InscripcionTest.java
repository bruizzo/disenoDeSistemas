package domain;

import org.junit.Assert;
import org.junit.Test;

public class InscripcionTest {

    @Test
    public void InscripcionAceptada() {

        Alumno unAlumno = new Alumno("Bruno Izzo");

        Materia materiaUno = new Materia("analisisDeSistemas");
        Materia materiaDos = new Materia("paradigmasDeProgramacion");
        Materia materiaTres = new Materia("diseñoDeSistemas");

        materiaTres.agregarMateriasCorrelativas(materiaUno, materiaDos);
        unAlumno.agregarMateriasAprobadas(materiaUno,materiaDos);

        Inscripcion unaInscripcion = new Inscripcion();
        unaInscripcion.setNroInscripcion(1);
        unaInscripcion.setSolicitante(unAlumno);
        unaInscripcion.agregarMateriasSolicitadas(materiaTres);

        Assert.assertTrue(unaInscripcion.aprobada());
    }

    @Test
    public void InscripcionRechazada() {

        Alumno unAlumno = new Alumno("Bruno Izzo");

        Materia materiaUno = new Materia("analisisDeSistemas");
        Materia materiaDos = new Materia("paradigmasDeProgramacion");
        Materia materiaTres = new Materia("diseñoDeSistemas");

        materiaTres.agregarMateriasCorrelativas(materiaUno, materiaDos);
        unAlumno.agregarMateriasAprobadas(materiaUno);

        Inscripcion unaInscripcion = new Inscripcion();
        unaInscripcion.setNroInscripcion(2);
        unaInscripcion.setSolicitante(unAlumno);
        unaInscripcion.agregarMateriasSolicitadas(materiaTres);

        Assert.assertFalse(unaInscripcion.aprobada());
    }

}
