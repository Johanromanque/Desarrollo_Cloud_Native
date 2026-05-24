package cl.duoc.plataforma.repository;

import cl.duoc.plataforma.model.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
}