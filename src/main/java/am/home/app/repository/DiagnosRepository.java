package am.home.app.repository;

import am.home.app.entity.diagnose.DiagnoseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DiagnosRepository extends JpaRepository<DiagnoseEntity,Long> {
}
