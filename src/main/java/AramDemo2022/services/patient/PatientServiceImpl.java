package AramDemo2022.services.patient;

import AramDemo2022.common.patient.PatientCreateDTO;
import AramDemo2022.common.patient.PatientDTO;
import AramDemo2022.common.patient.PatientUpdateDTO;
import AramDemo2022.convertation.PatientConvert;
import AramDemo2022.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatientServiceImpl implements PatientService{

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    PatientConvert patientConvert;

    @Override
    public PatientDTO create(PatientCreateDTO patientCreateDTO) {
        return null;
    }



    @Override
    public PatientDTO get(Long id) {
        return null;
    }

    @Override
    public PatientDTO update(PatientUpdateDTO patientUpdateDTO) {
        return null;
    }
}
