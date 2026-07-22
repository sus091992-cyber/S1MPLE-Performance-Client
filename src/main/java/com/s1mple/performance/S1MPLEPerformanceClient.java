package com.s1mple.performance;

import net.fabricmc.api.ClientModInitializer;
import com.s1mple.performance.core.PerformanceService;

public class S1MPLEPerformanceClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        PerformanceService.getInstance().initialize();
    }
}
