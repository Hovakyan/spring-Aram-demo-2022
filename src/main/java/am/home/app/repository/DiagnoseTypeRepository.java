package am.home.app.repository;

import am.home.app.entity.diagnose.DiagnoseTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnoseTypeRepository extends JpaRepository<DiagnoseTypeEntity,Long > {
}
