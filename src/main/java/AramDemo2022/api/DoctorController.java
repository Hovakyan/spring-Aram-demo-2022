package AramDemo2022.api;

import AramDemo2022.common.DoctorCreatDTO;
import AramDemo2022.common.DoctorDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/doctors")
public interface DoctorController {


    @PostMapping (name = "")
    DoctorDTO create (@RequestBody DoctorCreatDTO doctorCreatDTO);
}
