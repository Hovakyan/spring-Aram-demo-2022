package AramDemo2022.services.doctor;

import AramDemo2022.common.doctor.DoctorCreatDTO;
import AramDemo2022.common.doctor.DoctorDTO;
import AramDemo2022.common.doctor.DoctorUpdateDTO;
import org.springframework.stereotype.Service;

@Service
public interface DoctorService {

    DoctorDTO creat(DoctorCreatDTO doctorCreatDTO);
    DoctorDTO get(Long doctorId);
   DoctorDTO  update(DoctorUpdateDTO doctorUpdateDTO);



}
