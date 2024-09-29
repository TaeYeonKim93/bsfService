package bsf.infra;

import bsf.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 분석결과집합HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<분석결과집합>> {

    @Override
    public EntityModel<분석결과집합> process(EntityModel<분석결과집합> model) {
        return model;
    }
}
