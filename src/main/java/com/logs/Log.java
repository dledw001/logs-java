package com.logs;

import java.util.UUID;
import java.time.Instant;
import java.util.Set;
import java.util.TreeSet;

public class Log {
  private UUID id;
  private String name;
  private Instant createInstant;
  private Set<LogDetail> logDetails;
  
  // New Log constructor
  public Log(String name) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.createInstant = Instant.now();
    this.logDetails = new TreeSet<>();
  }

  // Public getters
  public UUID getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Instant getCreateInstant() {
    return this.createInstant;
  }

  public Set<LogDetail> getLogDetails() {
    return this.logDetails;
  }

  // Public toString method
  public String toString() {
    String string = "%s,%s,%s".formatted(this.id, this.name, this.createInstant);
    return string;
  }
}
