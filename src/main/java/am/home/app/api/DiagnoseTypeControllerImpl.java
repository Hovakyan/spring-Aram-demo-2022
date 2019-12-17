package am.home.app.api;

import am.home.app.common.DiagnosType;
import am.home.app.services.diagnose.DiagnosTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DiagnoseTypeControllerImpl implements DiagnoseTypeController {

    private final DiagnosTypeService diagnosTypeService;

    @Override
    public DiagnosType createDiagnoseType(DiagnosType diagnosType) {

        System.out.println(DiagnosType.SICK.getName());
        System.out.println(DiagnosType.HEALTHY.getName());
        return diagnosTypeService.create(diagnosType);
    }

    @Override
    public List<Integer> get(String name) {
        return null;
    }

    @Override
    public DiagnosType updateDiagnoseType(DiagnosType diagnosType) {
        return null;
    }
}
