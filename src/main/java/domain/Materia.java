package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {

    private String nombre;
    private String carrera;
    private List<Materia> materiasCorrelativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.materiasCorrelativas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void agregarMateriasCorrelativas(Materia ... materias) {
        Collections.addAll(this.materiasCorrelativas, materias);
    }

    public boolean esCorrelativa (Materia otraMateria) {
        return otraMateria.materiasCorrelativas.contains(this);
    }

    public boolean estaAprobada (Alumno unAlumno) {
        return unAlumno.getMateriasAprobadas().contains(this);
    }
}
