package com.example.elasticbeanstalk;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


  @RequestMapping("/")
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok("root 접속 가능합니다.\n");
  }
}
