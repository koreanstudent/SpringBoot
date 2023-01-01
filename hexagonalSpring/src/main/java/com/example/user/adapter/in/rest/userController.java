package com.example.user.adapter.in.rest;

import com.example.common.RestApiAdapter;

import com.example.user.application.port.in.SampleUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestApiAdapter
@RequiredArgsConstructor
public class userController {

  private final SampleUseCase sampleUseCase;



  @GetMapping("/api/v1/dev/client-sample")
  public ResponseEntity<String> clientSample() {

    return ResponseEntity.ok(sampleUseCase.callAuthClient());
  }
}
