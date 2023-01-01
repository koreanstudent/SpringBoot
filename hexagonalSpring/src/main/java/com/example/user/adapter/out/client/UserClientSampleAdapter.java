package com.example.user.adapter.out.client;


import com.example.common.FeignClientAdapter;
import com.example.user.adapter.out.client.feign.UserFeignClent;
import com.example.user.application.port.out.SendSamplePort;
import com.example.user.application.port.out.event.SendSampleEvent;
import lombok.RequiredArgsConstructor;


@FeignClientAdapter
@RequiredArgsConstructor
public class UserClientSampleAdapter implements SendSamplePort {

  private final UserFeignClent userFeignClent;

  @Override
  public String sendSample(SendSampleEvent sendSampleEvent) {
    return userFeignClent.sendSignupPacer(sendSampleEvent);
  }
}
