package AramDemo2022.services.diagnose;

import AramDemo2022.common.diagnos.DiagnosCreateDTO;
import AramDemo2022.common.diagnos.DiagnosUpdateDTO;
import AramDemo2022.common.diagnos.DiagnoseDTO;
import AramDemo2022.convertation.DiagnosConvert;
import AramDemo2022.entity.diagnose.DiagnosEntity;
import AramDemo2022.repository.DiagnosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiagnosServiceImpl implements DiagnosService {

   @Autowired
    DiagnosRepository diagnosRepository;
   @Autowired
    DiagnosConvert diagnosConvert;

    @Override
    public DiagnoseDTO create(DiagnosCreateDTO diagnosCreateDTO) {
        DiagnosEntity diagnosEntity = diagnosConvert.convert(diagnosCreateDTO);
       diagnosRepository.save(diagnosEntity);
       DiagnoseDTO diagnoseDTO = diagnosConvert.convert(diagnosEntity);
       return diagnoseDTO;
    }

    @Override
    public DiagnoseDTO get(Long id) {
        DiagnosEntity diagnosEntity = diagnosRepository.getOne(id);
        DiagnoseDTO diagnoseDTO = diagnosConvert.convert(diagnosEntity);
        return diagnoseDTO;
    }

    @Override
    public DiagnoseDTO update(DiagnosUpdateDTO diagnosUpdateDTO) {

    DiagnosEntity diagnosEntity = diagnosRepository.getOne(diagnosUpdateDTO.getId());
    diagnosConvert.convert(diagnosUpdateDTO);
    diagnosRepository.save(diagnosEntity);
    DiagnoseDTO diagnoseDTO = diagnosConvert.convert(diagnosEntity);
        return diagnoseDTO;
    }
}
