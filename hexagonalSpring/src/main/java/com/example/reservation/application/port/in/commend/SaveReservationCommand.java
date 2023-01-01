package com.example.reservation.application.port.in.commend;

public record SaveReservationCommand(
    String userId,
    String name
) {

}
