package cl.duoc.plataforma.service;

import cl.duoc.plataforma.model.Curso;
import cl.duoc.plataforma.model.DetalleInscripcion;
import cl.duoc.plataforma.model.Inscripcion;
import cl.duoc.plataforma.repository.CursoRepository;
import cl.duoc.plataforma.repository.InscripcionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InscripcionService {

    private final CursoRepository cursoRepository;
    private final InscripcionRepository inscripcionRepository;

    public InscripcionService(CursoRepository cursoRepository, InscripcionRepository inscripcionRepository) {
        this.cursoRepository = cursoRepository;
        this.inscripcionRepository = inscripcionRepository;
    }

    public Inscripcion inscribirEstudiante(String nombreEstudiante, String correoEstudiante, List<Long> cursosIds) {

        List<Curso> cursosEncontrados = cursoRepository.findAllById(cursosIds);

        if (cursosEncontrados.isEmpty()) {
            throw new RuntimeException("No se encontraron cursos para inscribir.");
        }

        List<DetalleInscripcion> detalle = new ArrayList<>();
        int total = 0;

        for (Curso curso : cursosEncontrados) {
            DetalleInscripcion item = new DetalleInscripcion(
                    curso.getId(),
                    curso.getNombre(),
                    curso.getInstructor(),
                    curso.getCosto()
            );

            detalle.add(item);
            total += curso.getCosto();
        }

        Inscripcion inscripcion = new Inscripcion(
                nombreEstudiante,
                correoEstudiante,
                total,
                detalle
        );

        return inscripcionRepository.save(inscripcion);
    }

    public List<Inscripcion> listarInscripciones() {
        return inscripcionRepository.findAll();
    }
}