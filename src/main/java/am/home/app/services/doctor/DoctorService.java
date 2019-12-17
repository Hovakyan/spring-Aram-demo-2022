package am.home.app.services.doctor;

import am.home.app.common.doctor.DoctorCreateDto;
import am.home.app.common.doctor.DoctorDTO;
import am.home.app.common.doctor.DoctorUpdateDTO;
import org.springframework.stereotype.Service;

@Service
public interface DoctorService {

    DoctorDTO create(DoctorCreateDto doctorCreateDto);
    DoctorDTO getDoctorById(Long doctorId);
   DoctorDTO  update(DoctorUpdateDTO doctorUpdateDTO);



}
