package net.herit.rookie.restapitemplate.features.healthcheck.controller;

import net.herit.rookie.restapitemplate.features.healthcheck.dto.ResponseHealth;
import net.herit.rookie.restapitemplate.features.healthcheck.service.HealthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping()
    public ResponseEntity<ResponseHealth> health() {
        return ResponseEntity.ok(healthService.getHealthStatus());
    }
}
