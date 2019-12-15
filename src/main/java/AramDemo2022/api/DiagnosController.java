package AramDemo2022.api;

import AramDemo2022.common.diagnos.DiagnosCreateDTO;
import AramDemo2022.common.diagnos.DiagnosUpdateDTO;
import AramDemo2022.common.diagnos.DiagnoseDTO;
import AramDemo2022.common.doctor.DoctorDTO;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/diagnos")
public interface DiagnosController {


    @PostMapping ("")
    DiagnoseDTO create (@RequestBody DiagnosCreateDTO diagnosCreateDTO);



    @GetMapping (path = "/{id}")
    DiagnoseDTO get (@PathVariable ("id") Long id);

    @PutMapping ("")
    DiagnoseDTO update (@RequestBody DiagnosUpdateDTO diagnosUpdateDTO);






}
