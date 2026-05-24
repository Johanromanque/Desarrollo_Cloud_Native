package cl.duoc.plataforma.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "inscripciones")
public class Inscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreEstudiante;
    private String correoEstudiante;
    private Integer totalPagar;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleInscripcion> cursos = new ArrayList<>();

    public Inscripcion() {
    }

    public Inscripcion(String nombreEstudiante, String correoEstudiante, Integer totalPagar, List<DetalleInscripcion> cursos) {
        this.nombreEstudiante = nombreEstudiante;
        this.correoEstudiante = correoEstudiante;
        this.totalPagar = totalPagar;
        this.cursos = cursos;
    }

    public Long getId() {
        return id;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public Integer getTotalPagar() {
        return totalPagar;
    }

    public List<DetalleInscripcion> getCursos() {
        return cursos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }

    public void setTotalPagar(Integer totalPagar) {
        this.totalPagar = totalPagar;
    }

    public void setCursos(List<DetalleInscripcion> cursos) {
        this.cursos = cursos;
    }
}