package com.textiles.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.textiles.models.YarnModel;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "yarns", path = "yarns")
public interface YarnRepository extends CrudRepository<YarnModel, Long>{

}
