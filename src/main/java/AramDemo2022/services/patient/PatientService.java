package AramDemo2022.services.patient;

import AramDemo2022.common.patient.PatientCreateDTO;
import AramDemo2022.common.patient.PatientDTO;
import AramDemo2022.common.patient.PatientUpdateDTO;

public interface PatientService {


    PatientDTO create(PatientCreateDTO patientCreateDTO);
    PatientDTO get(Long id);
    PatientDTO update(PatientUpdateDTO patientUpdateDTO);


}