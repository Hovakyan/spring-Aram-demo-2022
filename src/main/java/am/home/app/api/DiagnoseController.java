package am.home.app.api;

import am.home.app.common.diagnos.DiagnoseCreateDTO;
import am.home.app.common.diagnos.DiagnoseUpdateDOT;
import am.home.app.common.diagnos.DiagnoseDTO;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/diagnos")
public interface DiagnoseController {


    @PostMapping
    DiagnoseDTO create(@RequestBody DiagnoseCreateDTO diagnoseCreateDto);

    @GetMapping(path = "/{id}")
    DiagnoseDTO getOne(@PathVariable("id") Long id);

    @PutMapping
    DiagnoseDTO updateDiagnoseDto(@RequestBody DiagnoseUpdateDOT diagnoseUpdateDto);


}
