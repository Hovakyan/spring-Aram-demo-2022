package AramDemo2022.api;

import AramDemo2022.common.patient.PatientCreateDTO;
import AramDemo2022.common.patient.PatientDTO;
import AramDemo2022.common.patient.PatientUpdateDTO;
import AramDemo2022.services.patient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientControllerImpl implements PatientController {


    @Autowired
    PatientService patientService;


    @Override
    public PatientDTO create(PatientCreateDTO patientCreateDTO) {
       PatientDTO patientDTO = patientService.create(patientCreateDTO);
        return patientDTO;
    }

    @Override
    public PatientDTO get(Long id) {

    PatientDTO patientDTO = patientService.get(id);
        return patientDTO;
    }

    @Override
    public PatientDTO update(PatientUpdateDTO patientUpdateDTO) {
        PatientDTO patientDTO = patientService.update(patientUpdateDTO);
        return patientDTO;
    }
}
