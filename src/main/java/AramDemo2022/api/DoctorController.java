package AramDemo2022.api;

import AramDemo2022.common.doctor.DoctorCreatDTO;
import AramDemo2022.common.doctor.DoctorDTO;
import AramDemo2022.common.doctor.DoctorUpdateDTO;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/doctors")
public interface DoctorController {


    @PostMapping (name = "")
    DoctorDTO create (@RequestBody DoctorCreatDTO doctorCreatDTO);


    @GetMapping (path = "/{id}")
    DoctorDTO get(@PathVariable ("id") Long id);

    @PutMapping(name = "")
    DoctorDTO update(@RequestBody DoctorUpdateDTO doctorUpdateDTO);




}
