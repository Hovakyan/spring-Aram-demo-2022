package am.home.app.api;

import am.home.app.common.patient.PatientDoctorDto;
import am.home.app.common.patient.PatientDTO;
import am.home.app.common.patient.PatientUpdateDTO;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/patient")
public interface PatientController {

    @PostMapping
    PatientDTO create(@RequestBody PatientDoctorDto patientDoctorDto);

    @GetMapping(path = "/{id}")
    PatientDTO get(@PathVariable("id") Long id);

    @PutMapping
    PatientDTO update(@RequestBody PatientUpdateDTO patientUpdateDTO);
}
