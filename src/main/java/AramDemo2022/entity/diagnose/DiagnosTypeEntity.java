package AramDemo2022.entity.diagnose;

import AramDemo2022.common.DiagnosType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Getter
@Setter
public class DiagnosTypeEntity {



    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private DiagnosType name;


}
