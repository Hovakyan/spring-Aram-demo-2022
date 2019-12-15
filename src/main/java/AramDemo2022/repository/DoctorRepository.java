package AramDemo2022.repository;

import AramDemo2022.common.DoctorDTO;
import AramDemo2022.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<DoctorEntity,Long> {




}
