package am.home.app.repository;

import am.home.app.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity,Long> {



    DoctorEntity getByName(String docName);
}
