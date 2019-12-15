package AramDemo2022.repository;

import AramDemo2022.entity.diagnose.DiagnosTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosTypeRepository extends JpaRepository<DiagnosTypeEntity,Long > {
}
