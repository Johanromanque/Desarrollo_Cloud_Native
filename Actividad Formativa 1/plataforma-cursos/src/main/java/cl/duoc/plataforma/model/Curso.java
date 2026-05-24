package cl.duoc.plataforma.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String instructor;
    private String duracion;
    private Integer costo;

    public Curso() {
    }

    public Curso(Long id, String nombre, String instructor, String duracion, Integer costo) {
        this.id = id;
        this.nombre = nombre;
        this.instructor = instructor;
        this.duracion = duracion;
        this.costo = costo;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getDuracion() {
        return duracion;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }
}