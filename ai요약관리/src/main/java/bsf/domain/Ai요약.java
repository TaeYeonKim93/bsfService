package bsf.domain;

import bsf.Ai요약관리Application;
import bsf.domain.Ai요약생성됨;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Ai요약_table")
@Data
//<<< DDD / Aggregate Root
public class Ai요약 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        Ai요약생성됨 ai요약생성됨 = new Ai요약생성됨(this);
        ai요약생성됨.publishAfterCommit();
    }

    public static Ai요약Repository repository() {
        Ai요약Repository ai요약Repository = Ai요약관리Application.applicationContext.getBean(
            Ai요약Repository.class
        );
        return ai요약Repository;
    }

    public void ai요약생성() {
        //implement business logic here:

    }
}
//>>> DDD / Aggregate Root
