package AramDemo2022.api;

import AramDemo2022.common.diagnos.DiagnosCreateDTO;
import AramDemo2022.common.diagnos.DiagnosUpdateDTO;
import AramDemo2022.common.diagnos.DiagnoseDTO;
import AramDemo2022.services.diagnose.DiagnosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiagnosControllerImpl implements DiagnosController {


    @Autowired
    DiagnosService diagnosService;

    @Override
    public DiagnoseDTO create(DiagnosCreateDTO diagnosCreateDTO) {

       DiagnoseDTO diagnoseDTO = diagnosService.create(diagnosCreateDTO);
        return diagnoseDTO;
    }

    @Override
    public DiagnoseDTO get(Long id) {
        DiagnoseDTO diagnoseDTO = diagnosService.get(id);
        return diagnoseDTO;
    }

    @Override
    public DiagnoseDTO update(DiagnosUpdateDTO diagnosUpdateDTO) {
        DiagnoseDTO diagnoseDTO = diagnosService.update(diagnosUpdateDTO);
        return diagnoseDTO;
    }
}
