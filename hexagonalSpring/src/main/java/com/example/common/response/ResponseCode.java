package com.example.common.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResponseCode {
  SUCCESS("00", "success");


  private final String code;
  private final String message;

}
