package com.example.reservation.application.port.out;

import com.example.reservation.domain.Reservation;

public interface SaveReservationPort {


  Reservation saveReservation(Reservation reservation);

}
