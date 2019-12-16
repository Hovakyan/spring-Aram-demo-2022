package AramDemo2022.api;

import AramDemo2022.common.DiagnosType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping (value = "/diagnostype")
public interface DiagnosTypeController {

    @PostMapping ("")
    DiagnosType creat (@RequestParam DiagnosType diagnosType);

    @GetMapping(path = "/{count_by_name}")
    List<Integer> get(@PathVariable ("count_by_name") String name);



    @PutMapping("")
    DiagnosType update (@RequestBody DiagnosType diagnosType);


}
