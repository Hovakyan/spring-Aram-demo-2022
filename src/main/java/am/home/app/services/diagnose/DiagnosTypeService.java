package am.home.app.services.diagnose;


import am.home.app.common.DiagnosType;

import java.util.List;

public interface DiagnosTypeService {

    DiagnosType create(DiagnosType diagnosType);

    List<DiagnosType> getCount(DiagnosType diagnosType);

    DiagnosType update(DiagnosType diagnosType);
}
