package com.s1mple.performance.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PerformanceService {
    public static final Logger LOGGER = LoggerFactory.getLogger("S1MPLE-Performance");
    private static PerformanceService instance;

    private PerformanceService() {}

    public static PerformanceService getInstance() {
        if (instance == null) {
            instance = new PerformanceService();
        }
        return instance;
    }

    public void initialize() {
        LOGGER.info("S1MPLE Performance Service Initialized - Sodium Compatible");
    }
}
