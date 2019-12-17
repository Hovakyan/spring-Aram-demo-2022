package am.home.app.services.patient;

import am.home.app.common.patient.PatientDoctorDto;
import am.home.app.common.patient.PatientDTO;
import am.home.app.common.patient.PatientUpdateDTO;
import am.home.app.convertation.DoctorConvert;
import am.home.app.convertation.PatientConvert;
import am.home.app.entity.DoctorEntity;
import am.home.app.entity.PatientEntity;
import am.home.app.repository.DoctorRepository;
import am.home.app.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final PatientConvert patientConvert;
    private final DoctorRepository doctorRepository;
    private final DoctorConvert doctorConvert;


    @Override
    public PatientDTO create(PatientDoctorDto patientDoctorDto) {
            PatientEntity patientEntity = patientConvert.convert(patientDoctorDto);
//            patientRepository.save(patientEntity);

        DoctorEntity doctorEntity = doctorRepository.getByName(patientDoctorDto.getDoctorName());
        doctorEntity.getPatientEntityList().add(patientEntity);
        patientRepository.save(patientEntity);

        System.out.println(doctorEntity.getId());
        System.out.println(patientEntity.getId());


        return patientConvert.convert(patientEntity);

    }

    @Override
    public PatientDTO get(Long id) {
        PatientEntity patientEntity = patientRepository.getOne(id);
        return patientConvert.convert(patientEntity);
    }


    @Override
    public PatientDTO update(PatientUpdateDTO patientUpdateDTO) {

        PatientEntity patientEntity = patientRepository.getOne(patientUpdateDTO.getId());

        patientRepository.save(patientEntity);
        return patientConvert.convert(patientEntity);
    }
}
