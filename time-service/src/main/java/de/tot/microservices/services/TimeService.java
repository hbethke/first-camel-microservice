package de.tot.microservices.services;

import java.time.LocalTime;

public class TimeService {
  public LocalTime getTime() {
    return LocalTime.now();
  }
}