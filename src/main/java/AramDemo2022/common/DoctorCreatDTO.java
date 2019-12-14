package AramDemo2022.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DoctorCreatDTO {

    private String docName;

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }
}
