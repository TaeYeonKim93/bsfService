package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class 데이터삽입됨 extends AbstractEvent {

    private Long id;

    public 데이터삽입됨(데이터집합 aggregate) {
        super(aggregate);
    }

    public 데이터삽입됨() {
        super();
    }
}
//>>> DDD / Domain Event
