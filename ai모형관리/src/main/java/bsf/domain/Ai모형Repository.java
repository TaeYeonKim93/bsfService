package bsf.domain;

import bsf.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "ai모형", path = "ai모형")
public interface Ai모형Repository
    extends PagingAndSortingRepository<Ai모형, Long> {}
