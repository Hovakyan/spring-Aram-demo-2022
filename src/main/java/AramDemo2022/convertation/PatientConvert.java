package AramDemo2022.convertation;

import AramDemo2022.common.patient.PatientCreateDTO;
import AramDemo2022.common.patient.PatientDTO;
import AramDemo2022.common.patient.PatientUpdateDTO;
import AramDemo2022.entity.PatientEntity;

public class PatientConvert {

    private PatientDTO convert(PatientEntity patientEntity) {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setId(patientEntity.getId());
        patientDTO.setName(patientEntity.getName());
        patientDTO.setSurName(patientEntity.getSurName());

        return patientDTO;
    }

    private PatientEntity convert(PatientCreateDTO patientCreateDTO) {
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(patientCreateDTO.getId());
        patientEntity.setName(patientCreateDTO.getName());
        patientEntity.setSurName(patientCreateDTO.getSurName());
        return patientEntity;
    }

    private void convert(PatientUpdateDTO patientUpdateDTO) {

    }
}
