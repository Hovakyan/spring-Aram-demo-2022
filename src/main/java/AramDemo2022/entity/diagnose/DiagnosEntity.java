package AramDemo2022.entity.diagnose;

import AramDemo2022.common.DiagnosType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class DiagnosEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;




}