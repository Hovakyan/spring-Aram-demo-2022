package AramDemo2022.api;

import AramDemo2022.common.DoctorCreatDTO;
import AramDemo2022.common.DoctorDTO;
import AramDemo2022.common.DoctorUpdateDTO;
import org.springframework.http.MediaType;
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
