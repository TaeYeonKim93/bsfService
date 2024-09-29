package bsf.infra;

import bsf.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 데이터집합HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<데이터집합>> {

    @Override
    public EntityModel<데이터집합> process(EntityModel<데이터집합> model) {
        return model;
    }
}
