package com.example.user.application.port.out.event;

import lombok.Builder;

public record SendSampleEvent(
    String userId,
    String name
) {
  @Builder
  public SendSampleEvent {
  }
}
