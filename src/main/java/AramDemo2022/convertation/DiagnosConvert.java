package AramDemo2022.convertation;

import AramDemo2022.common.diagnos.DiagnosCreateDTO;
import AramDemo2022.common.diagnos.DiagnosUpdateDTO;
import AramDemo2022.common.diagnos.DiagnoseDTO;
import AramDemo2022.entity.diagnose.DiagnosEntity;
import AramDemo2022.repository.DiagnosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiagnosConvert {

    @Autowired
    DiagnosRepository diagnosRepository;

    public DiagnoseDTO convert(DiagnosEntity diagnosEntity) {
        DiagnoseDTO diagnoseDTO = new DiagnoseDTO();
        diagnoseDTO.setId(diagnosEntity.getId());
        diagnoseDTO.setName(diagnosEntity.getName());

        return diagnoseDTO;
    }

    public DiagnosEntity convert(DiagnosCreateDTO diagnosCreateDTO) {
        DiagnosEntity diagnosEntity = new DiagnosEntity();
        diagnosEntity.setId(diagnosCreateDTO.getId());
        diagnosEntity.setName(diagnosCreateDTO.getName());
        return diagnosEntity;
    }

    public void convert(DiagnosUpdateDTO diagnosUpdateDTO) {
        DiagnosEntity diagnosEntity = diagnosRepository.getOne(diagnosUpdateDTO.getId());
        diagnosEntity.setName(diagnosUpdateDTO.getName());
    }


}
