package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class 시각화지도생성됨 extends AbstractEvent {

    private Long id;

    public 시각화지도생성됨(시각화지도 aggregate) {
        super(aggregate);
    }

    public 시각화지도생성됨() {
        super();
    }
}
//>>> DDD / Domain Event
