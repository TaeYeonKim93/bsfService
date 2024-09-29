package bsf.domain;

import bsf.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "ai요약", path = "ai요약")
public interface Ai요약Repository
    extends PagingAndSortingRepository<Ai요약, Long> {}
