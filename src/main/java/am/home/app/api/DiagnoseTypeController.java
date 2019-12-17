package am.home.app.api;

import am.home.app.common.DiagnosType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/diagnostype")
public interface DiagnoseTypeController {

    @PostMapping
    DiagnosType createDiagnoseType(@RequestParam DiagnosType diagnosType);

    @GetMapping(path = "/{count_by_name}")
    List<Integer> get(@PathVariable("count_by_name") String name);

    @PutMapping
    DiagnosType updateDiagnoseType(@RequestBody DiagnosType diagnosType);

}
