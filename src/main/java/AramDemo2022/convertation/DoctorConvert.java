package AramDemo2022.convertation;

import AramDemo2022.common.DoctorCreatDTO;
import AramDemo2022.common.DoctorDTO;
import AramDemo2022.entity.DoctorEntity;
import org.springframework.stereotype.Component;

@Component
public class DoctorConvert {


    DoctorEntity doctorEntity;

    public DoctorEntity convert(DoctorCreatDTO doctorCreatDTO){
      doctorEntity.setDocName(doctorCreatDTO.getDocName());

        return doctorEntity;
    }


    public DoctorDTO convert(DoctorEntity entity) {
        //TODO implemeny this
        return null;}


}
