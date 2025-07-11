package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /** 배포 확인용 엔드포인트: http://<SERVER_IP>:8080/ */
    @GetMapping("/")
    public String home() {
        return "✅ Hello, CI/CD! 배포 OK";
    }

    /** 헬스체크 엔드포인트: http://<SERVER_IP>:8080/healthz */
    @GetMapping("/healthz")
    public String healthz() {
        return "ok";
    }
}
