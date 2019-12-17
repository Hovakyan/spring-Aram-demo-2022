package am.home.app.services.diagnose;

import am.home.app.common.diagnos.DiagnoseCreateDTO;
import am.home.app.common.diagnos.DiagnoseUpdateDOT;
import am.home.app.common.diagnos.DiagnoseDTO;
import am.home.app.convertation.DiagnoseConvert;
import am.home.app.entity.diagnose.DiagnoseEntity;
import am.home.app.repository.DiagnosRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class DiagnosServiceImpl implements DiagnosService {


   private final DiagnosRepository diagnosRepository;

   private  final DiagnoseConvert diagnoseConvert;

    @Override
    public DiagnoseDTO create(DiagnoseCreateDTO diagnosCreateDTO) {
        log.info("Creating DiagnoseDto with {} body",diagnosCreateDTO);
        DiagnoseEntity diagnoseEntity = diagnoseConvert.convert(diagnosCreateDTO);
       diagnosRepository.save(diagnoseEntity);
       log.info("Returning ConvertedDto with {} body",diagnoseEntity);
       DiagnoseDTO diagnoseDTO = diagnoseConvert.convert(diagnoseEntity);
       return diagnoseDTO;
    }

    @Override
    public DiagnoseDTO get(Long id) {
        log.info("Getting DiagnoseDTO by id",id);
        DiagnoseEntity diagnoseEntity = diagnosRepository.getOne(id);
        log.info("Returning ConvertDTO with {} body",diagnoseEntity);
        DiagnoseDTO diagnoseDTO = diagnoseConvert.convert(diagnoseEntity);
        return diagnoseDTO;
    }

    @Override
    public DiagnoseDTO update(DiagnoseUpdateDOT diagnoseUpdateDOT) {
        log.info("Getting DiagnoseDTO with {} body",diagnoseUpdateDOT);
    DiagnoseEntity diagnoseEntity = diagnosRepository.getOne(diagnoseUpdateDOT.getId());
        log.info("Renaming fields with {} body",diagnoseUpdateDOT);
    diagnoseConvert.convert(diagnoseUpdateDOT);
    diagnosRepository.save(diagnoseEntity);
   log.info("Returning ConvertedDTO with {} body",diagnoseEntity);
    DiagnoseDTO diagnoseDTO = diagnoseConvert.convert(diagnoseEntity);
        return diagnoseDTO;
    }
}
