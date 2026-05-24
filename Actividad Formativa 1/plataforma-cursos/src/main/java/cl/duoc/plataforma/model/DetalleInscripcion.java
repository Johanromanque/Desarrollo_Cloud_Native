package cl.duoc.plataforma.model;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_inscripcion")
public class DetalleInscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long cursoId;
    private String nombreCurso;
    private String instructor;
    private Integer costo;

    public DetalleInscripcion() {
    }

    public DetalleInscripcion(Long cursoId, String nombreCurso, String instructor, Integer costo) {
        this.cursoId = cursoId;
        this.nombreCurso = nombreCurso;
        this.instructor = instructor;
        this.costo = costo;
    }

    public Long getId() {
        return id;
    }

    public Long getCursoId() {
        return cursoId;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getInstructor() {
        return instructor;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }
}