package com.erpsom.repository;

import com.erpsom.domain.Armazon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "armazon", path = "armazon")
public interface ArmazonRepository extends CrudRepository<Armazon, Long>{

}
