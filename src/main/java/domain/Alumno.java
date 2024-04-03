package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {

    private String nombre;
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarMateriasAprobadas(Materia ... materias) {
        Collections.addAll(this.materiasAprobadas, materias);
    }

    public boolean puedeCursar (Materia unaMateria) {
        return unaMateria.getMateriasCorrelativas().stream().allMatch(m -> m.estaAprobada(this));
    }
}
