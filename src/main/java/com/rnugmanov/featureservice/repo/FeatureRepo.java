package com.rnugmanov.featureservice.repo;

import com.rnugmanov.featureservice.model.Feature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureRepo extends CrudRepository<Feature, Long> {
}
