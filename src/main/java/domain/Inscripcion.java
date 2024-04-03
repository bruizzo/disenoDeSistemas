package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {

    private Integer nroInscripcion;
    private Alumno solicitante;
    private List<Materia> materiasSolicitadas;

    public Inscripcion() {
        this.materiasSolicitadas = new ArrayList<>();
    }

    public Integer getNroInscripcion() {
        return nroInscripcion;
    }

    public void setNroInscripcion(Integer nroInscripcion) {
        this.nroInscripcion = nroInscripcion;
    }

    public Alumno getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Alumno solicitante) {
        this.solicitante = solicitante;
    }

    public List<Materia> getMateriasSolicitadas() {
        return materiasSolicitadas;
    }

    public void agregarMateriasSolicitadas(Materia ... materias) {
        Collections.addAll(this.materiasSolicitadas, materias);
    }

    public boolean aprobada() {
        return this.materiasSolicitadas.stream().allMatch(m -> this.solicitante.puedeCursar(m));
    }
}
