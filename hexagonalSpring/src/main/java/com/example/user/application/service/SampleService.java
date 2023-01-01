package com.example.user.application.service;

import com.example.common.UseCase;
import com.example.user.application.port.in.SampleUseCase;
import com.example.user.application.port.out.SendSamplePort;
import com.example.user.application.port.out.event.SendSampleEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RequiredArgsConstructor
@UseCase
public class SampleService implements SampleUseCase {

  private final SendSamplePort sendSamplePort;

  @Override
  public String callAuthClient() {
    // 파라미터로 변수, command가 들어 올 수 있다.

    SendSampleEvent sendSampleEvent  = SendSampleEvent.builder()
        .userId("유저아이디")
        .name("이창현")
        .build();
    return sendSamplePort.sendSample(sendSampleEvent);
  }
}
