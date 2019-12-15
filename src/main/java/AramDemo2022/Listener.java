package AramDemo2022;

import AramDemo2022.common.DoctorCreatDTO;
import AramDemo2022.common.DoctorDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class Listener {

   @Autowired
   private ObjectMapper objectMapper;

    @EventListener({ContextRefreshedEvent.class})
    public void onContextRefreshedEvent() {

        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setId(1L);
        doctorDTO.setDocName("ggg");

        DoctorCreatDTO doctorCreatDTO = new DoctorCreatDTO();
        doctorCreatDTO.setName("Marta");
        try {
            String docString = objectMapper.writeValueAsString(doctorDTO);


            String doccreat = objectMapper.writeValueAsString(doctorCreatDTO);

            System.out.println();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }




}
