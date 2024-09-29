package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class 모형성능분석실행됨 extends AbstractEvent {

    private Long id;

    public 모형성능분석실행됨(분석결과집합 aggregate) {
        super(aggregate);
    }

    public 모형성능분석실행됨() {
        super();
    }
}
//>>> DDD / Domain Event
