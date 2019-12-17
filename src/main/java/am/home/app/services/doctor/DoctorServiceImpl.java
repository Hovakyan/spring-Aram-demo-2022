package am.home.app.services.doctor;

import am.home.app.common.doctor.DoctorCreateDto;
import am.home.app.common.doctor.DoctorDTO;
import am.home.app.common.doctor.DoctorUpdateDTO;
import am.home.app.convertation.DoctorConvert;
import am.home.app.entity.DoctorEntity;
import am.home.app.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;
    private final DoctorConvert doctorConvert;

    @Override
    public DoctorDTO create(DoctorCreateDto doctorCreateDto) {
        log.info("Creating DoctorDto with {} body", doctorCreateDto);
        DoctorEntity doctorEntity = doctorConvert.convert(doctorCreateDto);
        doctorRepository.save(doctorEntity);
        log.info("Returning ConvertedDto with {} body", doctorEntity);
        return doctorConvert.convert(doctorEntity);
    }

    @Override
    public DoctorDTO getDoctorById(Long doctorId) {
        DoctorEntity entity = doctorRepository.getOne(doctorId);
        return doctorConvert.convert(entity);
    }

    @Override
    public DoctorDTO update(DoctorUpdateDTO doctorUpdateDTO) {
        DoctorEntity doctorEntity = doctorRepository.getOne(doctorUpdateDTO.getId());
//        doctorConvert.convert(doctorUpdateDTO);
        doctorRepository.save(doctorEntity);
        return doctorConvert.convert(doctorEntity);
    }
}
