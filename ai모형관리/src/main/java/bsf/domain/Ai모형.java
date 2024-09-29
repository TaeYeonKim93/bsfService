package bsf.domain;

import bsf.Ai모형관리Application;
import bsf.domain.Ai모형배포됨;
import bsf.domain.Ai모형추가됨;
import bsf.domain.Ai모형학습됨;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Ai모형_table")
@Data
//<<< DDD / Aggregate Root
public class Ai모형 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long modelId;

    private String modelName;

    private Integer status;

    @PostPersist
    public void onPostPersist() {
        Ai모형추가됨 ai모형추가됨 = new Ai모형추가됨(this);
        ai모형추가됨.publishAfterCommit();

        Ai모형학습됨 ai모형학습됨 = new Ai모형학습됨(this);
        ai모형학습됨.publishAfterCommit();

        Ai모형배포됨 ai모형배포됨 = new Ai모형배포됨(this);
        ai모형배포됨.publishAfterCommit();
    }

    public static Ai모형Repository repository() {
        Ai모형Repository ai모형Repository = Ai모형관리Application.applicationContext.getBean(
            Ai모형Repository.class
        );
        return ai모형Repository;
    }

    public void ai모형추가() {
        //implement business logic here:

    }

    public void ai모형학습() {
        //implement business logic here:

    }

    public void ai모형배포() {
        //implement business logic here:

    }
}
//>>> DDD / Aggregate Root
