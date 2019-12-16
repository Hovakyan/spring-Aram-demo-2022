package AramDemo2022.services.diagnose;


import AramDemo2022.common.DiagnosType;

import java.util.List;

public interface DiagnosTypeService {

    DiagnosType creat (DiagnosType diagnosType);
    List<DiagnosType> getcount (DiagnosType diagnosType);
    DiagnosType update (DiagnosType diagnosType);
}
