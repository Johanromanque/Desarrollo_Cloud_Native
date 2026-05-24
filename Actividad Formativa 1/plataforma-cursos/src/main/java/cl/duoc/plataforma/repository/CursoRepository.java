package cl.duoc.plataforma.repository;

import cl.duoc.plataforma.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}