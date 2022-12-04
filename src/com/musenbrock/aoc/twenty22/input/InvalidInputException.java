package com.musenbrock.aoc.twenty22.input;

public class InvalidInputException extends RuntimeException {
  public InvalidInputException(String message) {
    super("Invalid input: " + message);
  }
}
