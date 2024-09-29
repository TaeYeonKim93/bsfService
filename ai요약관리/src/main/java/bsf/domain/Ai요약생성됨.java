package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Ai요약생성됨 extends AbstractEvent {

    private Long id;

    public Ai요약생성됨(Ai요약 aggregate) {
        super(aggregate);
    }

    public Ai요약생성됨() {
        super();
    }
}
//>>> DDD / Domain Event
