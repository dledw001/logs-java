package com.logs;

import java.util.UUID;
import java.time.Instant;

public class LogDetail {
  private UUID logId;
  private Instant createInstant;
  private double value;

  // New LogDetail constructor
  public LogDetail(UUID logId, double value) {
    this.logId = logId;
    this.value = value;
    this.createInstant = Instant.now();
  }

  // Public getters
  public UUID getLogId() {
    return this.logId;
  }

  public Instant getCreateInstant() {
    return this.createInstant;
  }

  public double getValue() {
    return this.value;
  }

  // Public toString method
  public String toString() {
    String string = "%s,%s,%s".formatted(this.logId, this.createInstant, this.value);
    return string;
  }
}
