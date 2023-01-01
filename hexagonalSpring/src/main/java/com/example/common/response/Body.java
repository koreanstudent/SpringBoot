package com.example.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.Strings;
import java.io.Serializable;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;


@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Body<T> implements Serializable {


  private String code;


  private String message;


  private T data;

  @Builder(access = AccessLevel.PRIVATE)
  private Body(ResponseCode responseCode, String addMessage, T data) {
    this.code = responseCode.getCode();
    this.message = responseCode.getMessage();
    if (!Strings.isNullOrEmpty(addMessage)) {
      this.message += addMessage;
    }
    this.data = data;
  }

  public static <T> Body<T> success() {
    return (Body<T>) Body.builder()
        .responseCode(ResponseCode.SUCCESS)
        .build();
  }

  public static <T> Body<T> success(T data) {
    return (Body<T>) Body.builder()
        .responseCode(ResponseCode.SUCCESS)
        .data(data)
        .build();
  }
}
