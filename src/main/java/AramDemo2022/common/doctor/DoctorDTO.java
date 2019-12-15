package AramDemo2022.common.doctor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorDTO {



    private  Long id;
    private String docName;

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
