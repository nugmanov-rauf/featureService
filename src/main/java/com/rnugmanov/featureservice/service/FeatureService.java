package com.rnugmanov.featureservice.service;

import com.rnugmanov.featureservice.model.Feature;
import com.rnugmanov.featureservice.repo.FeatureRepo;

import java.util.List;

public interface FeatureService {
    List<Feature> getFeatures();
}
