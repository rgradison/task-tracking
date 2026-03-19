package com.omnipotent.task_tracking.infrastructure.config;

import com.omnipotent.task_tracking.application.port.in.FeatureFlagPort;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class FeatureConfigAdapter implements FeatureFlagPort {
    @Value("${task.feature-enabled:false}")
    private boolean featureEnabled;

    @Override
    public boolean isFeatureEnabled() {
        return featureEnabled;
    }
}