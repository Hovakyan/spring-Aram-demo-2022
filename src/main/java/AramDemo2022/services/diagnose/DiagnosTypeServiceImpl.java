package AramDemo2022.services.diagnose;

import AramDemo2022.common.DiagnosType;
import AramDemo2022.entity.diagnose.DiagnosTypeEntity;
import AramDemo2022.repository.DiagnosTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DiagnosTypeServiceImpl implements DiagnosTypeService {

    @Autowired
    DiagnosTypeRepository diagnosTypeRepository;


    @Override
    public DiagnosType creat(DiagnosType diagnosType) {
        DiagnosTypeEntity diagnosTypeEntity = new DiagnosTypeEntity();
        diagnosTypeEntity.setName(diagnosType);
        diagnosTypeRepository.save(diagnosTypeEntity);
        String text = diagnosTypeEntity.getName().name();
        return DiagnosType.valueOf(text);
    }

    @Override
    public List<DiagnosType> getcount(DiagnosType diagnosType) {

        return null;
    }

    @Override
    public DiagnosType update(DiagnosType diagnosType) {
        return null;
    }
}
