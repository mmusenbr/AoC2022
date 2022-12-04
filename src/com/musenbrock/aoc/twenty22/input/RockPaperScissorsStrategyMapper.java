package com.musenbrock.aoc.twenty22.input;

import static com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissors.PAPER;
import static com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissors.ROCK;
import static com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissors.SCISSORS;

import com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissors;
import com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissorsStrategy;

public class RockPaperScissorsStrategyMapper {
  public static RockPaperScissors fromStrategy(String code) {
    return switch (code) {
      case "A", "X" -> ROCK;
      case "B", "Y" -> PAPER;
      case "C", "Z" -> SCISSORS;
      default -> throw new InvalidInputException("code: " + code);
    };
  }

  public static RockPaperScissorsStrategy fromString(String input) {
    String[] parts = input.trim().split(" ");

    if (parts.length != 2) {
      throw new InvalidInputException("input: " + input);
    }

    return new RockPaperScissorsStrategy(RockPaperScissorsStrategyMapper.fromStrategy(parts[0]),
                                         RockPaperScissorsStrategyMapper.fromStrategy(parts[1]));
  }

  public static RockPaperScissorsStrategy fromStrings(String opponent, String own) {
    return new RockPaperScissorsStrategy(RockPaperScissorsStrategyMapper.fromStrategy(opponent),
                                         RockPaperScissorsStrategyMapper.fromStrategy(own));
  }
}
