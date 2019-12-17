package am.home.app.api;

import am.home.app.common.doctor.DoctorCreateDto;
import am.home.app.common.doctor.DoctorDTO;
import am.home.app.common.doctor.DoctorUpdateDTO;
import am.home.app.services.doctor.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DoctorControllerImpl implements DoctorController {

    private final DoctorService doctorService;

    @Override
    public DoctorDTO create(DoctorCreateDto doctorCreateDto) {
        return doctorService.create(doctorCreateDto);
    }

    @Override
    public DoctorDTO get(Long id) {
        doctorService.getDoctorById(id);
        return doctorService.getDoctorById(id);
    }

    @Override
    public DoctorDTO update(DoctorUpdateDTO doctorUpdateDTO) {
        return doctorService.update(doctorUpdateDTO);
    }
}
