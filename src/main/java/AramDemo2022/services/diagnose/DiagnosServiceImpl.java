package AramDemo2022.services.diagnose;

import AramDemo2022.common.diagnos.DiagnosCreateDTO;
import AramDemo2022.common.diagnos.DiagnosUpdateDTO;
import AramDemo2022.common.diagnos.DiagnoseDTO;
import AramDemo2022.convertation.DiagnosConvert;
import AramDemo2022.entity.diagnose.DiagnosEntity;
import AramDemo2022.repository.DiagnosRepository;
import org.springframework.beans.factory.annotation.Autowired;

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
        DiagnoseDTO diagnoseDTO = diagnosConvert.convert(diagnosRepository.getOne(id));
        return diagnoseDTO;
    }

    @Override
    public DiagnoseDTO update(DiagnosUpdateDTO diagnosUpdateDTO) {



        return null;
    }
}
