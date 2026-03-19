package com.omnipotent.task_tracking.infrastructure.adaptor.in.web.controller;

import com.omnipotent.task_tracking.application.port.in.FeatureFlagPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureController {

    private final FeatureFlagPort featureFlagPort;

    public FeatureController(FeatureFlagPort featureFlagPort) {
        this.featureFlagPort = featureFlagPort;
    }
    // This has to be called separately
    @GetMapping("/feature")
    public boolean getFeatureFlag() {
        return featureFlagPort.isFeatureEnabled();
    }

    @PostMapping("/feature")
    public boolean setFeatureFlag() {
        return featureFlagPort.isFeatureEnabled();//yet to beimplemented
    }
}