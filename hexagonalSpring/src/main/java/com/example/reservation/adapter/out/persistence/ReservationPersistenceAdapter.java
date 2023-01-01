package com.example.reservation.adapter.out.persistence;


import com.example.common.JpaAdapter;
import com.example.reservation.adapter.out.persistence.entity.ReservationJpaEntity;
import com.example.reservation.adapter.out.persistence.repository.ReservationRepository;
import com.example.reservation.application.port.out.SaveReservationPort;
import com.example.reservation.domain.Reservation;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@JpaAdapter
public class ReservationPersistenceAdapter implements SaveReservationPort {

  private final ReservationRepository reservationRepository;
  private final ReservationMapper reservationMapper;


  @Override
  public Reservation saveReservation(Reservation reservation) {

    ReservationJpaEntity reservationJpaEntity = reservationMapper.mapToJpaEntity(reservation);
    reservationRepository.save(reservationJpaEntity);

    Optional<ReservationJpaEntity> findId = reservationRepository.findById(reservationJpaEntity.getId());
    Reservation result = reservationMapper.mapToDomain(findId);
    return result;
  }
}
