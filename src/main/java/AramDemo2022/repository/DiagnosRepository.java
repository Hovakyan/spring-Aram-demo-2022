package AramDemo2022.repository;

import AramDemo2022.entity.diagnose.DiagnosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosRepository extends JpaRepository<DiagnosEntity,Long> {
}
