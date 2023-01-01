package com.example.user.adapter.out.client.feign;

import com.example.user.application.port.out.event.SendSampleEvent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "dev-api", url = "http://localhost:8090")
public interface UserFeignClent {

  @PostMapping("/api/v1/reservation")
  String sendSignupPacer(SendSampleEvent sendSampleEvent);

}
