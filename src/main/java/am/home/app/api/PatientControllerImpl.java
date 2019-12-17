package am.home.app.api;

import am.home.app.common.patient.PatientDoctorDto;
import am.home.app.common.patient.PatientDTO;
import am.home.app.common.patient.PatientUpdateDTO;
import am.home.app.services.patient.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PatientControllerImpl implements PatientController {

    private final PatientService patientService;

    @Override
    public PatientDTO create(PatientDoctorDto patientDoctorDto) {
        return patientService.create(patientDoctorDto);
    }

    @Override
    public PatientDTO get(Long id) {
        return patientService.get(id);
    }

    @Override
    public PatientDTO update(PatientUpdateDTO patientUpdateDTO) {
        return patientService.update(patientUpdateDTO);
    }

}
