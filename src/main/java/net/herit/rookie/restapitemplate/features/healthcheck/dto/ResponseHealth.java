// HealthResponse.java
package net.herit.rookie.restapitemplate.features.healthcheck.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ResponseHealth(
    String status,
    String message,
    @JsonProperty("timestamp")
    String timestamp
) {
    public static ResponseHealth ok() {
        return new ResponseHealth(
            "UP",
            "Application is running",
            java.time.LocalDateTime.now().toString()
        );
    }
}