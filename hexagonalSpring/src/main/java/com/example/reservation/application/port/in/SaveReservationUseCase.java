package com.example.reservation.application.port.in;

import com.example.reservation.application.port.in.commend.SaveReservationCommand;
import com.example.reservation.domain.Reservation;

public interface SaveReservationUseCase {

  Reservation saveReservation(SaveReservationCommand saveReservationCommand);

}
