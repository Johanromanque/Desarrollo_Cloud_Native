package cl.duoc.plataforma.controller;
import cl.duoc.plataforma.model.Inscripcion;
import cl.duoc.plataforma.service.InscripcionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inscripciones")
public class InscripcionController {

    private final InscripcionService inscripcionService;

    public InscripcionController(InscripcionService inscripcionService) {
        this.inscripcionService = inscripcionService;
    }

    @PostMapping
    public Inscripcion inscribirEstudiante(@RequestBody InscripcionRequest request) {
        return inscripcionService.inscribirEstudiante(
                request.getNombreEstudiante(),
                request.getCorreoEstudiante(),
                request.getCursosIds()
        );
    }

    @GetMapping
    public List<Inscripcion> listarInscripciones() {
        return inscripcionService.listarInscripciones();
    }

    public static class InscripcionRequest {

        private String nombreEstudiante;
        private String correoEstudiante;
        private List<Long> cursosIds;

        public String getNombreEstudiante() {
            return nombreEstudiante;
        }

        public String getCorreoEstudiante() {
            return correoEstudiante;
        }

        public List<Long> getCursosIds() {
            return cursosIds;
        }

        public void setNombreEstudiante(String nombreEstudiante) {
            this.nombreEstudiante = nombreEstudiante;
        }

        public void setCorreoEstudiante(String correoEstudiante) {
            this.correoEstudiante = correoEstudiante;
        }

        public void setCursosIds(List<Long> cursosIds) {
            this.cursosIds = cursosIds;
        }
    }
}