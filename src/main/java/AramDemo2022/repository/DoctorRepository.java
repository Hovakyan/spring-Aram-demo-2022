package AramDemo2022.repository;

import AramDemo2022.common.doctor.DoctorDTO;
import AramDemo2022.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<DoctorEntity,Long> {



    DoctorEntity getByName(String docName);
}
