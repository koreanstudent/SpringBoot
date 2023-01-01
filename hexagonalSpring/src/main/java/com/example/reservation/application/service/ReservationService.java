package com.example.reservation.application.service;


import com.example.common.UseCase;
import com.example.reservation.application.port.in.SaveReservationUseCase;
import com.example.reservation.application.port.in.commend.SaveReservationCommand;
import com.example.reservation.application.port.out.SaveReservationPort;
import com.example.reservation.domain.Reservation;
import lombok.RequiredArgsConstructor;


@UseCase
@RequiredArgsConstructor
public class ReservationService implements SaveReservationUseCase {

  private final SaveReservationPort saveReservationPort;
  @Override
  public Reservation saveReservation(SaveReservationCommand saveReservationCommand) {

    Reservation reservation = Reservation.builder()
        .reservationName(saveReservationCommand.name())
        .build();

    Reservation result = saveReservationPort.saveReservation(reservation);

    return result;
  }
}
