package AramDemo2022.services;

import AramDemo2022.common.DoctorCreatDTO;
import AramDemo2022.common.DoctorDTO;
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

        doctorRepository.save(doctorConvert.convert(doctorCreatDTO));

        return null ;
    }
}
