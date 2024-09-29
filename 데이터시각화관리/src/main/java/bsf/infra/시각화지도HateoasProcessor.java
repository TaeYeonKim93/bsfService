package bsf.infra;

import bsf.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 시각화지도HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<시각화지도>> {

    @Override
    public EntityModel<시각화지도> process(EntityModel<시각화지도> model) {
        return model;
    }
}
