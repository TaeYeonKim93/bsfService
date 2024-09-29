package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Ai모형배포됨 extends AbstractEvent {

    private Long id;

    public Ai모형배포됨(Ai모형 aggregate) {
        super(aggregate);
    }

    public Ai모형배포됨() {
        super();
    }
}
//>>> DDD / Domain Event
