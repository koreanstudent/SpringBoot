package com.example.user.domain;

import lombok.Builder;

public record user(

    String userId,
    String name,
    String mobileNumber
) {
  @Builder
  public user {

  }
}
