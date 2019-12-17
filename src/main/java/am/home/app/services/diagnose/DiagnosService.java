package am.home.app.services.diagnose;

import am.home.app.common.diagnos.DiagnoseCreateDTO;
import am.home.app.common.diagnos.DiagnoseUpdateDOT;
import am.home.app.common.diagnos.DiagnoseDTO;
import org.springframework.stereotype.Service;

@Service
public interface DiagnosService {


    DiagnoseDTO create(DiagnoseCreateDTO diagnosCreateDTO);
    DiagnoseDTO get(Long id);
    DiagnoseDTO update(DiagnoseUpdateDOT diagnoseUpdateDOT);



}
