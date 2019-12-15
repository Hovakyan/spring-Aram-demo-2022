package AramDemo2022.api;

import AramDemo2022.common.doctor.DoctorCreatDTO;
import AramDemo2022.common.doctor.DoctorDTO;
import AramDemo2022.common.doctor.DoctorUpdateDTO;
import AramDemo2022.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorControllerImpl implements DoctorController {


    @Autowired
   private DoctorService doctorService;

    @Override
    public DoctorDTO create(DoctorCreatDTO doctorCreatDTO) {
       DoctorDTO doctorDTO = doctorService.creat(doctorCreatDTO);

        return doctorDTO;
    }

    @Override
    public DoctorDTO get(Long id) {
     doctorService.get(id);
    DoctorDTO doctorDTO = doctorService.get(id);
        return doctorDTO;
    }

    @Override
    public DoctorDTO update(DoctorUpdateDTO doctorUpdateDTO) {

        DoctorDTO doctorDTO =doctorService.update(doctorUpdateDTO);
        return doctorDTO;
    }
}
