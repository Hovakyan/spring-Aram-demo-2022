package am.home.app.services.diagnose;

import am.home.app.common.DiagnosType;
import am.home.app.entity.diagnose.DiagnoseTypeEntity;
import am.home.app.repository.DiagnoseTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DiagnosTypeServiceImpl implements DiagnosTypeService {

    @Autowired
    DiagnoseTypeRepository diagnoseTypeRepository;


    @Override
    public DiagnosType create(DiagnosType diagnosType) {
        DiagnoseTypeEntity diagnoseTypeEntity = new DiagnoseTypeEntity();
        diagnoseTypeEntity.setName(diagnosType);
        diagnoseTypeRepository.save(diagnoseTypeEntity);
        String text = diagnoseTypeEntity.getName().name();
        return DiagnosType.valueOf(text);
    }

    @Override
    public List<DiagnosType> getCount(DiagnosType diagnosType) {

        return null;
    }

    @Override
    public DiagnosType update(DiagnosType diagnosType) {
        return null;
    }
}
