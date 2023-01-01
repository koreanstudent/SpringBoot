package com.example.reservation.adapter.out.persistence;


import com.example.reservation.adapter.out.persistence.entity.ReservationJpaEntity;
import com.example.reservation.domain.Reservation;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper {

  ReservationJpaEntity mapToJpaEntity(Reservation reservation) {
    return ReservationJpaEntity.builder()
        .reservationName(reservation.reservationName())
        .build();
  }

  Reservation mapToDomain(Optional<ReservationJpaEntity> reservationJpaEntity){
    return Reservation.builder()
        .reservationId(reservationJpaEntity.map(ReservationJpaEntity::getId).orElse(null))
        .reservationName(reservationJpaEntity.map(ReservationJpaEntity::getReservationName).orElse(null))
        .build();
  }
}
