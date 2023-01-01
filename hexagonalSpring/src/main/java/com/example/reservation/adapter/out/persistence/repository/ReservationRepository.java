package com.example.reservation.adapter.out.persistence.repository;

import com.example.reservation.adapter.out.persistence.entity.ReservationJpaEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationJpaEntity, Long> {


  Optional<ReservationJpaEntity> findById(Long id);

}
