package AramDemo2022.services;

import AramDemo2022.common.DoctorCreatDTO;
import AramDemo2022.common.DoctorDTO;
import org.springframework.stereotype.Service;

@Service
public interface DoctorService {

    DoctorDTO creat(DoctorCreatDTO doctorCreatDTO);
}
