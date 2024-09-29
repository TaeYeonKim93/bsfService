package bsf.domain;

import bsf.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "시각화지도",
    path = "시각화지도"
)
public interface 시각화지도Repository
    extends PagingAndSortingRepository<시각화지도, Long> {}
