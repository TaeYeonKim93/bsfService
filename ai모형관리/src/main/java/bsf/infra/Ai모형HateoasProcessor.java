package bsf.infra;

import bsf.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class Ai모형HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Ai모형>> {

    @Override
    public EntityModel<Ai모형> process(EntityModel<Ai모형> model) {
        return model;
    }
}
