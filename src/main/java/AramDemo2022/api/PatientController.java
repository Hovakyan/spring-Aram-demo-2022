package AramDemo2022.api;

import AramDemo2022.common.patient.PatientCreateDTO;
import AramDemo2022.common.patient.PatientDTO;
import AramDemo2022.common.patient.PatientUpdateDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/patient")
public interface PatientController {


    @PostMapping("")
    PatientDTO create(@RequestBody PatientCreateDTO patientCreateDTO);

    @GetMapping(path = "/{id}")
    PatientDTO get(@PathVariable("id") Long id);


    @PutMapping("")
    PatientDTO update(@RequestBody PatientUpdateDTO patientUpdateDTO);
}
