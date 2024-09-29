package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class 통계데이터갱신됨 extends AbstractEvent {

    private Long id;

    public 통계데이터갱신됨(통계관리 aggregate) {
        super(aggregate);
    }

    public 통계데이터갱신됨() {
        super();
    }
}
//>>> DDD / Domain Event
