package bsf.domain;

import bsf.domain.통계데이터갱신됨;
import bsf.통계관리Application;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "통계관리_table")
@Data
//<<< DDD / Aggregate Root
public class 통계관리 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long statisticId;

    private Long type;

    private Long period;

    private Long value;

    @PostPersist
    public void onPostPersist() {
        통계데이터갱신됨 통계데이터갱신됨 = new 통계데이터갱신됨(this);
        통계데이터갱신됨.publishAfterCommit();
    }

    public static 통계관리Repository repository() {
        통계관리Repository 통계관리Repository = 통계관리Application.applicationContext.getBean(
            통계관리Repository.class
        );
        return 통계관리Repository;
    }
}
//>>> DDD / Aggregate Root
