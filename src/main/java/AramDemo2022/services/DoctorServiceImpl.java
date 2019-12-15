package AramDemo2022.services;

import AramDemo2022.common.DoctorCreatDTO;
import AramDemo2022.common.DoctorDTO;
import AramDemo2022.common.DoctorUpdateDTO;
import AramDemo2022.convertation.DoctorConvert;
import AramDemo2022.entity.DoctorEntity;
import AramDemo2022.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    DoctorConvert doctorConvert;

    @Override
    public DoctorDTO creat(DoctorCreatDTO doctorCreatDTO) {
        DoctorEntity doctorEntity = doctorConvert.convert(doctorCreatDTO);
        doctorRepository.save(doctorEntity);
        DoctorDTO doctorDTO = doctorConvert.convert(doctorEntity);

        return doctorDTO;
    }

    @Override
    public DoctorDTO get(Long doctorId) {

        DoctorEntity entity = doctorRepository.getOne(doctorId);
        DoctorDTO doctorDTO = doctorConvert.convert(entity);

        return doctorDTO;
    }

    @Override
    public DoctorDTO update(DoctorUpdateDTO doctorUpdateDTO) {
        DoctorEntity doctorEntity = doctorRepository.getOne(doctorUpdateDTO.getId());
        doctorConvert.convert(doctorUpdateDTO);
        doctorRepository.save(doctorEntity);
        DoctorDTO doctorDTO = doctorConvert.convert(doctorEntity);

        return doctorDTO;
    }
}
