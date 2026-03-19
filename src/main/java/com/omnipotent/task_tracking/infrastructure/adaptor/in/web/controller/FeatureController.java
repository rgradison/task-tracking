package com.omnipotent.task_tracking.infrastructure.adaptor.in.web.controller;

import com.omnipotent.task_tracking.application.port.in.FeatureFlagPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureController {

    private final FeatureFlagPort featureFlagPort;

    public FeatureController(FeatureFlagPort featureFlagPort) {
        this.featureFlagPort = featureFlagPort;
    }

    @GetMapping("/feature")
    public boolean getFeatureFlag() {
        return featureFlagPort.isFeatureEnabled();
    }

}