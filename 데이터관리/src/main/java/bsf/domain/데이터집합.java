package bsf.domain;

import bsf.domain.데이터삽입됨;
import bsf.데이터관리Application;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "데이터집합_table")
@Data
//<<< DDD / Aggregate Root
public class 데이터집합 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long dataId;

    private Integer dataType;

    private Long size;

    private Date createAt;

    private String dataValue;

    @PostPersist
    public void onPostPersist() {
        데이터삽입됨 데이터삽입됨 = new 데이터삽입됨(this);
        데이터삽입됨.publishAfterCommit();
    }

    public static 데이터집합Repository repository() {
        데이터집합Repository 데이터집합Repository = 데이터관리Application.applicationContext.getBean(
            데이터집합Repository.class
        );
        return 데이터집합Repository;
    }

    public void 데이터연계() {
        //implement business logic here:

    }

    public void 데이터삽입() {
        //implement business logic here:

    }
}
//>>> DDD / Aggregate Root
