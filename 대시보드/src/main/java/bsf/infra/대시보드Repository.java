package bsf.infra;

import bsf.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "대시보드", path = "대시보드")
public interface 대시보드Repository
    extends PagingAndSortingRepository<대시보드, Long> {}
