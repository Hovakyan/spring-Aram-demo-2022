package am.home.app.api;

import am.home.app.common.diagnos.DiagnoseCreateDTO;
import am.home.app.common.diagnos.DiagnoseDTO;
import am.home.app.common.diagnos.DiagnoseUpdateDOT;
import am.home.app.services.diagnose.DiagnosService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DiagnoseControllerImpl implements DiagnoseController {

    private final DiagnosService diagnosService;

    @Override
    public DiagnoseDTO create(DiagnoseCreateDTO diagnoseCreateDto) {
        return diagnosService.create(diagnoseCreateDto);
    }

    @Override
    public DiagnoseDTO getOne(Long id) {
        return diagnosService.get(id);
    }

    @Override
    public DiagnoseDTO updateDiagnoseDto(DiagnoseUpdateDOT diagnoseUpdateDto) {
        return diagnosService.update(diagnoseUpdateDto);
    }
}
