package bsf.infra;

import bsf.config.kafka.KafkaProcessor;
import bsf.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class 대시보드ViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private 대시보드Repository 대시보드Repository;
    //>>> DDD / CQRS
}
