package bsf.domain;

import bsf.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "분석결과집합",
    path = "분석결과집합"
)
public interface 분석결과집합Repository
    extends PagingAndSortingRepository<분석결과집합, Long> {}
