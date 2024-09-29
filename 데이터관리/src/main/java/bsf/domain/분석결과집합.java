package bsf.domain;

import bsf.domain.모형성능분석실행됨;
import bsf.domain.위험도분석실행됨;
import bsf.데이터관리Application;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "분석결과집합_table")
@Data
//<<< DDD / Aggregate Root
public class 분석결과집합 {

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
        위험도분석실행됨 위험도분석실행됨 = new 위험도분석실행됨(this);
        위험도분석실행됨.publishAfterCommit();

        모형성능분석실행됨 모형성능분석실행됨 = new 모형성능분석실행됨(this);
        모형성능분석실행됨.publishAfterCommit();
    }

    public static 분석결과집합Repository repository() {
        분석결과집합Repository 분석결과집합Repository = 데이터관리Application.applicationContext.getBean(
            분석결과집합Repository.class
        );
        return 분석결과집합Repository;
    }

    //<<< Clean Arch / Port Method
    public static void 위험도분석실행(Ai모형배포됨 ai모형배포됨) {
        //implement business logic here:

        /** Example 1:  new item 
        분석결과집합 분석결과집합 = new 분석결과집합();
        repository().save(분석결과집합);

        */

        /** Example 2:  finding and process
        
        repository().findById(ai모형배포됨.get???()).ifPresent(분석결과집합->{
            
            분석결과집합 // do something
            repository().save(분석결과집합);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void 모형성능분석실행(Ai모형학습됨 ai모형학습됨) {
        //implement business logic here:

        /** Example 1:  new item 
        분석결과집합 분석결과집합 = new 분석결과집합();
        repository().save(분석결과집합);

        */

        /** Example 2:  finding and process
        
        repository().findById(ai모형학습됨.get???()).ifPresent(분석결과집합->{
            
            분석결과집합 // do something
            repository().save(분석결과집합);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
