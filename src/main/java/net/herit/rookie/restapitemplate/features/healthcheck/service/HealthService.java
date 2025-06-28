package net.herit.rookie.restapitemplate.features.healthcheck.service;

import net.herit.rookie.restapitemplate.features.healthcheck.dto.ResponseHealth;
import org.springframework.stereotype.Service;

@Service
public class HealthService {
    public ResponseHealth getHealthStatus() {
        // 실제 헬스체크 로직 추가 가능
        return ResponseHealth.ok();
    }
}
