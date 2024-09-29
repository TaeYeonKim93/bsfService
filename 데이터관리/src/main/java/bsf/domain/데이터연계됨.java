package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class 데이터연계됨 extends AbstractEvent {

    private Long id;

    public 데이터연계됨() {
        super();
    }
}
//>>> DDD / Domain Event
