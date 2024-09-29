package bsf.domain;

import bsf.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "통계관리", path = "통계관리")
public interface 통계관리Repository
    extends PagingAndSortingRepository<통계관리, Long> {}
