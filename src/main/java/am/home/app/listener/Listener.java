package am.home.app.listener;

import am.home.app.common.doctor.DoctorCreateDto;
import am.home.app.common.doctor.DoctorDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class Listener {

    private final ObjectMapper objectMapper;

    @EventListener({ContextRefreshedEvent.class})
    public void onContextRefreshedEvent() {

        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setId(1L);
        doctorDTO.setDocName("ggg");

        DoctorCreateDto doctorCreateDto = new DoctorCreateDto();
        doctorCreateDto.setDoctorName("Marta");
        try {
            String docString = objectMapper.writeValueAsString(doctorDTO);


            String doccreat = objectMapper.writeValueAsString(doctorCreateDto);

            System.out.println();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }


}
