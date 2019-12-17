package am.home.app.entity.diagnose;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "diagnoses")
@Getter
@Setter
@NoArgsConstructor
public class DiagnoseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;




}
