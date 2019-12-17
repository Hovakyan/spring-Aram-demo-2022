package am.home.app.services.patient;

import am.home.app.common.patient.PatientDoctorDto;
import am.home.app.common.patient.PatientDTO;
import am.home.app.common.patient.PatientUpdateDTO;
import org.springframework.stereotype.Service;

@Service
public interface PatientService {


    PatientDTO create(PatientDoctorDto patientDoctorDto);
    PatientDTO get(Long id);
    PatientDTO update(PatientUpdateDTO patientUpdateDTO);


}
