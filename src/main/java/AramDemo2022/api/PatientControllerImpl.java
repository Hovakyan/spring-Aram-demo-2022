package AramDemo2022.api;

import AramDemo2022.common.doctor.DoctorCreatDTO;
import AramDemo2022.common.doctor.DoctorDTO;
import AramDemo2022.common.patient.PatientCreateDTO;
import AramDemo2022.common.patient.PatientDTO;
import AramDemo2022.common.patient.PatientUpdateDTO;
import AramDemo2022.entity.DoctorEntity;
import AramDemo2022.repository.DoctorRepository;
import AramDemo2022.services.doctor.DoctorService;
import AramDemo2022.services.patient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientControllerImpl implements PatientController {


    @Autowired
    PatientService patientService;
    @Autowired
    DoctorService doctorService;



    @Override
    public PatientDTO create(PatientCreateDTO patientCreateDTO, DoctorCreatDTO doctorCreatDTO) {
        PatientDTO patientDTO = patientService.create(patientCreateDTO,doctorCreatDTO);

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
