package AramDemo2022.services.patient;

import AramDemo2022.common.doctor.DoctorCreatDTO;
import AramDemo2022.common.doctor.DoctorDTO;
import AramDemo2022.common.patient.PatientCreateDTO;
import AramDemo2022.common.patient.PatientDTO;
import AramDemo2022.common.patient.PatientUpdateDTO;
import AramDemo2022.convertation.DoctorConvert;
import AramDemo2022.convertation.PatientConvert;
import AramDemo2022.entity.DoctorEntity;
import AramDemo2022.entity.PatientEntity;
import AramDemo2022.repository.DoctorRepository;
import AramDemo2022.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    PatientConvert patientConvert;
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    DoctorConvert doctorConvert;


    @Override
    public PatientDTO create(PatientCreateDTO patientCreateDTO,DoctorCreatDTO doctorCreatDTO) {
        PatientEntity patientEntity = patientConvert.convert(patientCreateDTO);

        DoctorEntity doctorEntity = doctorRepository.getByName(doctorCreatDTO.getName());
       doctorEntity.getPatientEntityList().add(patientEntity);

        patientEntity.setDoctorEntity(doctorEntity);


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
