package AramDemo2022.services.diagnose;

import AramDemo2022.common.diagnos.DiagnosCreateDTO;
import AramDemo2022.common.diagnos.DiagnosUpdateDTO;
import AramDemo2022.common.diagnos.DiagnoseDTO;
import org.springframework.stereotype.Service;

@Service
public interface DiagnosService {


    DiagnoseDTO create(DiagnosCreateDTO diagnosCreateDTO);
    DiagnoseDTO get(Long id);
    DiagnoseDTO update(DiagnosUpdateDTO diagnosUpdateDTO);



}
