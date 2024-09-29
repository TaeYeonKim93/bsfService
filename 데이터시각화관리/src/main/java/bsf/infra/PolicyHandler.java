package bsf.infra;

import bsf.config.kafka.KafkaProcessor;
import bsf.domain.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    시각화지도Repository 시각화지도Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='위험도분석실행됨'"
    )
    public void whenever위험도분석실행됨_시각화지도갱신(
        @Payload 위험도분석실행됨 위험도분석실행됨
    ) {
        위험도분석실행됨 event = 위험도분석실행됨;
        System.out.println(
            "\n\n##### listener 시각화지도갱신 : " + 위험도분석실행됨 + "\n\n"
        );

        // Comments //
        //1. 최저주거위기지역 위치
        // 2. 주거빈곤지역 위치
        // 3. 주변복지자원 위치

        // Sample Logic //
        시각화지도.시각화지도갱신(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
