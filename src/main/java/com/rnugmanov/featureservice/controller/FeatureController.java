package com.rnugmanov.featureservice.controller;

import com.rnugmanov.featureservice.model.Feature;
import com.rnugmanov.featureservice.service.FeatureService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FeatureController {

    private FeatureService featureService;

    public FeatureController(FeatureService featureService) {
        this.featureService = featureService;
    }

    @GetMapping("/features")
    public List<Feature> getFeatures(){
        return featureService.getFeatures();
    }
}
