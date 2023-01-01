package com.example.user.application.port.out;

import com.example.user.application.port.out.event.SendSampleEvent;

public interface SendSamplePort {

  String sendSample(SendSampleEvent sendSampleEvent);

}
