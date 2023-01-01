package com.example.reservation.domain;

import lombok.Builder;

public record Reservation(

    Long reservationId,
    String reservationName
) {
  @Builder
  public Reservation {

  }
}
