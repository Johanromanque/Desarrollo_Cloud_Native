package cl.duoc.plataforma.controller;

import cl.duoc.plataforma.model.Curso;
import cl.duoc.plataforma.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.listarCursos();
    }

    @PostMapping
    public Curso agregarCurso(@RequestBody Curso curso) {
        return cursoService.agregarCurso(curso);
    }
}