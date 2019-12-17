package am.home.app.convertation;

import am.home.app.common.diagnos.DiagnoseCreateDTO;
import am.home.app.common.diagnos.DiagnoseUpdateDOT;
import am.home.app.common.diagnos.DiagnoseDTO;
import am.home.app.entity.diagnose.DiagnoseEntity;
import am.home.app.repository.DiagnosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DiagnoseConvert {

    private final DiagnosRepository diagnosRepository;

    public DiagnoseDTO convert(DiagnoseEntity diagnoseEntity) {
        DiagnoseDTO diagnoseDTO = new DiagnoseDTO();
        diagnoseDTO.setId(diagnoseEntity.getId());
        diagnoseDTO.setName(diagnoseEntity.getName());

        return diagnoseDTO;
    }

    public DiagnoseEntity convert(DiagnoseCreateDTO diagnosCreateDTO) {
        DiagnoseEntity diagnoseEntity = new DiagnoseEntity();
        diagnoseEntity.setId(diagnosCreateDTO.getId());
        diagnoseEntity.setName(diagnosCreateDTO.getName());
        return diagnoseEntity;
    }

    public void convert(DiagnoseUpdateDOT diagnoseUpdateDOT) {
        DiagnoseEntity diagnoseEntity = diagnosRepository.getOne(diagnoseUpdateDOT.getId());
        diagnoseEntity.setName(diagnoseUpdateDOT.getName());
    }


}
