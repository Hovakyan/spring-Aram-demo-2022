package AramDemo2022.api;

import AramDemo2022.common.DoctorCreatDTO;
import AramDemo2022.common.DoctorDTO;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorControllerImpl implements DoctorController {

    @Override
    public DoctorDTO create(DoctorCreatDTO doctorCreatDTO) {
        return null;
    }
}
