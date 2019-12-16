package AramDemo2022.api;

import AramDemo2022.common.DiagnosType;
import AramDemo2022.services.diagnose.DiagnosTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class DiagnosTypeControllerImpl implements DiagnosTypeController{

   @Autowired
    DiagnosTypeService diagnosTypeService;

    @Override
    public DiagnosType creat(DiagnosType diagnosType) {

        System.out.println(DiagnosType.SICK.getName());
        System.out.println(DiagnosType.HEALTHY.getName());
        return diagnosTypeService.creat(diagnosType);
    }

    @Override
    public List<Integer> get(String name) {
        return null;
    }

    @Override
    public DiagnosType update(DiagnosType diagnosType) {
        return null;
    }
}
