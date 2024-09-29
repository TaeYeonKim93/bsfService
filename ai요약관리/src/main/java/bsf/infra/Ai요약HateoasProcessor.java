package bsf.infra;

import bsf.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class Ai요약HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Ai요약>> {

    @Override
    public EntityModel<Ai요약> process(EntityModel<Ai요약> model) {
        return model;
    }
}
