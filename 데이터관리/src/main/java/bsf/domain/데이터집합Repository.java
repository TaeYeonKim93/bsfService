package bsf.domain;

import bsf.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "데이터집합",
    path = "데이터집합"
)
public interface 데이터집합Repository
    extends PagingAndSortingRepository<데이터집합, Long> {}
