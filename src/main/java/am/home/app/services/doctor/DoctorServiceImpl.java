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
        log.info("Getting DiagnoseDTO by id",doctorId);
        DoctorEntity entity = doctorRepository.getOne(doctorId);
        log.info("Returning ConvertDTO with {} body",entity);
        return doctorConvert.convert(entity);
    }

    @Override
    public DoctorDTO update(DoctorUpdateDTO doctorUpdateDTO) {
        log.info("Getting DoctorDTO with {} body",doctorUpdateDTO);
        DoctorEntity doctorEntity = doctorRepository.getOne(doctorUpdateDTO.getId());
        log.info("Renaming fields with {} body",doctorUpdateDTO);
        doctorConvert.convert(doctorUpdateDTO);
        doctorRepository.save(doctorEntity);
        log.info("Returning ConvertedDTO with {} body",doctorEntity);
        return doctorConvert.convert(doctorEntity);
    }
}
