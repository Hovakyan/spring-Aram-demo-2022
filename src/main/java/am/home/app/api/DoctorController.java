package am.home.app.api;

import am.home.app.common.doctor.DoctorCreateDto;
import am.home.app.common.doctor.DoctorDTO;
import am.home.app.common.doctor.DoctorUpdateDTO;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/doctors")
public interface DoctorController {

    @PostMapping
    DoctorDTO create(@RequestBody DoctorCreateDto doctorCreateDto);

    @GetMapping(path = "/{id}")
    DoctorDTO get(@PathVariable("id") Long id);

    @PutMapping
    DoctorDTO update(@RequestBody DoctorUpdateDTO doctorUpdateDTO);

}
