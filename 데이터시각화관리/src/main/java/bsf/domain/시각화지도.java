package bsf.domain;

import bsf.domain.시각화지도갱신됨;
import bsf.domain.시각화지도생성됨;
import bsf.데이터시각화관리Application;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "시각화지도_table")
@Data
//<<< DDD / Aggregate Root
public class 시각화지도 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        시각화지도갱신됨 시각화지도갱신됨 = new 시각화지도갱신됨(this);
        시각화지도갱신됨.publishAfterCommit();

        시각화지도생성됨 시각화지도생성됨 = new 시각화지도생성됨(this);
        시각화지도생성됨.publishAfterCommit();
    }

    public static 시각화지도Repository repository() {
        시각화지도Repository 시각화지도Repository = 데이터시각화관리Application.applicationContext.getBean(
            시각화지도Repository.class
        );
        return 시각화지도Repository;
    }

    public void 시각화지도생성() {
        //implement business logic here:

    }

    //<<< Clean Arch / Port Method
    public static void 시각화지도갱신(위험도분석실행됨 위험도분석실행됨) {
        //implement business logic here:

        /** Example 1:  new item 
        시각화지도 시각화지도 = new 시각화지도();
        repository().save(시각화지도);

        */

        /** Example 2:  finding and process
        
        repository().findById(위험도분석실행됨.get???()).ifPresent(시각화지도->{
            
            시각화지도 // do something
            repository().save(시각화지도);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
