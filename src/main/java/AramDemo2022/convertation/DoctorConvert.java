package AramDemo2022.convertation;

import AramDemo2022.common.doctor.DoctorCreatDTO;
import AramDemo2022.common.doctor.DoctorDTO;
import AramDemo2022.common.doctor.DoctorUpdateDTO;
import AramDemo2022.entity.DoctorEntity;
import AramDemo2022.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DoctorConvert {


        @Autowired
    DoctorRepository doctorRepository;

    public DoctorEntity convert(DoctorCreatDTO doctorCreatDTO){
        DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setName(doctorCreatDTO.getName());

        return doctorEntity;
    }


    public DoctorDTO convert(DoctorEntity entity) {
        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setDocName(entity.getName());
        doctorDTO.setId(entity.getId());
        return doctorDTO;}

     public  void convert(DoctorUpdateDTO doctorUpdateDTO) {

         DoctorEntity doctorEntity = doctorRepository.getOne(doctorUpdateDTO.getId());
         doctorEntity.setName(doctorUpdateDTO.getName());

     }


}
