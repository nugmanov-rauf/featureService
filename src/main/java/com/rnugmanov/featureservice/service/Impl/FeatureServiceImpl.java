package com.rnugmanov.featureservice.service.Impl;

import com.rnugmanov.featureservice.model.Feature;
import com.rnugmanov.featureservice.repo.FeatureRepo;
import com.rnugmanov.featureservice.service.FeatureService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FeatureServiceImpl implements FeatureService {

    private FeatureRepo featureRepo;

    public FeatureServiceImpl(FeatureRepo featureRepo) {
        this.featureRepo = featureRepo;
    }

    public List<Feature> getFeatures(){
        return (List<Feature>) this.featureRepo.findAll();
    }
}
