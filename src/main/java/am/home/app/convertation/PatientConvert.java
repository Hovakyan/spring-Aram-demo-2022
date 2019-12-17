package am.home.app.convertation;

import am.home.app.common.patient.PatientDoctorDto;
import am.home.app.common.patient.PatientDTO;
import am.home.app.common.patient.PatientUpdateDTO;
import am.home.app.entity.PatientEntity;
import am.home.app.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PatientConvert {


    private final PatientRepository patientRepository;

    public PatientDTO convert(PatientEntity patientEntity) {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setId(patientEntity.getId());
        patientDTO.setName(patientEntity.getName());
        patientDTO.setSurName(patientEntity.getSurName());
        return patientDTO;
    }

    public PatientEntity convert(PatientDoctorDto patientDoctorDto) {
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setName(patientDoctorDto.getPatientName());
        patientEntity.setSurName(patientDoctorDto.getPatientSurName());

        return patientEntity;
    }

    public void convert(PatientUpdateDTO patientUpdateDTO) {
        PatientEntity patientEntity = patientRepository.getOne(patientUpdateDTO.getId());
        patientEntity.setName(patientUpdateDTO.getName());
        patientEntity.setSurName(patientUpdateDTO.getSurName());
    }

}
