package bsf.infra;

import bsf.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 통계관리HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<통계관리>> {

    @Override
    public EntityModel<통계관리> process(EntityModel<통계관리> model) {
        return model;
    }
}
