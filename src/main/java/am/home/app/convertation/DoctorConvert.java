package am.home.app.convertation;

import am.home.app.common.doctor.DoctorCreateDto;
import am.home.app.common.doctor.DoctorDTO;
import am.home.app.common.doctor.DoctorUpdateDTO;
import am.home.app.entity.DoctorEntity;
import am.home.app.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DoctorConvert {

    private final DoctorRepository doctorRepository;

    public DoctorEntity convert(DoctorCreateDto doctorCreateDto) {
        DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setName(doctorCreateDto.getDoctorName());
        return doctorEntity;
    }

    public DoctorDTO convert(DoctorEntity entity) {
        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setDocName(entity.getName());
        doctorDTO.setId(entity.getId());
        return doctorDTO;
    }

    public void convert(DoctorUpdateDTO doctorUpdateDTO) {
        DoctorEntity doctorEntity = doctorRepository.getOne(doctorUpdateDTO.getId());
        doctorEntity.setName(doctorUpdateDTO.getName());

    }

}
