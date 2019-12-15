package AramDemo2022.services.patient;

import AramDemo2022.common.patient.PatientCreateDTO;
import AramDemo2022.common.patient.PatientDTO;
import AramDemo2022.common.patient.PatientUpdateDTO;
import AramDemo2022.convertation.PatientConvert;
import AramDemo2022.entity.PatientEntity;
import AramDemo2022.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    PatientConvert patientConvert;

    @Override
    public PatientDTO create(PatientCreateDTO patientCreateDTO) {
        PatientEntity patientEntity = patientConvert.convert(patientCreateDTO);
        patientRepository.save(patientEntity);
        PatientDTO patientDTO = patientConvert.convert(patientEntity);
        return patientDTO;
    }

    @Override
    public PatientDTO get(Long id) {
        PatientEntity patientEntity = patientRepository.getOne(id);
        PatientDTO patientDTO = patientConvert.convert(patientEntity);

        return patientDTO;
    }


    @Override
    public PatientDTO update(PatientUpdateDTO patientUpdateDTO) {

        PatientEntity patientEntity = patientRepository.getOne(patientUpdateDTO.getId());
        patientConvert.convert(patientUpdateDTO);
        patientRepository.save(patientEntity);
        PatientDTO patientDTO = patientConvert.convert(patientEntity);
        return patientDTO;
    }
}
