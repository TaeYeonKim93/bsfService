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
    데이터집합Repository 데이터집합Repository;

    @Autowired
    분석결과집합Repository 분석결과집합Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Ai모형배포됨'"
    )
    public void wheneverAi모형배포됨_위험도분석실행(
        @Payload Ai모형배포됨 ai모형배포됨
    ) {
        Ai모형배포됨 event = ai모형배포됨;
        System.out.println(
            "\n\n##### listener 위험도분석실행 : " + ai모형배포됨 + "\n\n"
        );

        // Comments //
        //1. 점유형태별 고위험군 분석
        // 2. 주택유형별 고위험군 분석
        // 3. 독립변수별 가중치 분석
        // 4. 복지자원 연관도 분석

        // Sample Logic //
        분석결과집합.위험도분석실행(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Ai모형학습됨'"
    )
    public void wheneverAi모형학습됨_모형성능분석실행(
        @Payload Ai모형학습됨 ai모형학습됨
    ) {
        Ai모형학습됨 event = ai모형학습됨;
        System.out.println(
            "\n\n##### listener 모형성능분석실행 : " + ai모형학습됨 + "\n\n"
        );

        // Sample Logic //
        분석결과집합.모형성능분석실행(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
