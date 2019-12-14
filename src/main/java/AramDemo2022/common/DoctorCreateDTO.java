package AramDemo2022.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorCreateDTO {

    private String doctorName;

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}
