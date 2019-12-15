package AramDemo2022.convertation;

import AramDemo2022.common.DoctorCreatDTO;
import AramDemo2022.common.DoctorDTO;
import AramDemo2022.common.DoctorUpdateDTO;
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
        doctorEntity.setDocName(doctorCreatDTO.getName());

        return doctorEntity;
    }


    public DoctorDTO convert(DoctorEntity entity) {
        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setDocName(entity.getDocName());
        doctorDTO.setId(entity.getId());
        return doctorDTO;}

     public  void convert(DoctorUpdateDTO doctorUpdateDTO) {

         DoctorEntity doctorEntity = doctorRepository.getOne(doctorUpdateDTO.getId());
         doctorEntity.setDocName(doctorUpdateDTO.getName());

     }


}
