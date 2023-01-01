package com.example.reservation.adapter.out.persistence.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name ="reservation")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReservationJpaEntity
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String reservationName;

  @Builder
  public ReservationJpaEntity(
      String reservationName
  ){
    this.reservationName = reservationName;
  }
}
