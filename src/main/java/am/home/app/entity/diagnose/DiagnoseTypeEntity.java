package am.home.app.entity.diagnose;

import am.home.app.common.DiagnosType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Getter
@Setter
public class DiagnoseTypeEntity {



    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private DiagnosType name;


}
