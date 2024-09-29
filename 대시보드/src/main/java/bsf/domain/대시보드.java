package bsf.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "대시보드_table")
@Data
public class 대시보드 {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
