package com.example.reservation.adapter.in.rest;


import com.example.common.RestApiAdapter;
import com.example.common.response.Body;
import com.example.reservation.application.port.in.SaveReservationUseCase;
import com.example.reservation.application.port.in.commend.SaveReservationCommand;
import com.example.reservation.domain.Reservation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestApiAdapter
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ReservationController {

  private final SaveReservationUseCase saveReservationUseCase;

  @PostMapping(path = "/reservation")
  public ResponseEntity<Body<Reservation>> savePacer(@RequestBody SaveReservationCommand savePacerCommand){
    System.out.println("userid: {}" + savePacerCommand.userId());
    System.out.println("name: {}" + savePacerCommand.name());

    Reservation result = saveReservationUseCase.saveReservation(savePacerCommand);

    return ResponseEntity.ok(Body.success(result));
  }
}
