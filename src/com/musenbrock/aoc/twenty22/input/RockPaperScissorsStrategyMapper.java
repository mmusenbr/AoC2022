package com.musenbrock.aoc.twenty22.input;

import static com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissors.PAPER;
import static com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissors.ROCK;
import static com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissors.SCISSORS;

import com.musenbrock.aoc.twenty22.rockpaperscissors.GameResult;
import com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissors;
import com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissorsExpectedResultStrategy;
import com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissorsOwnHandStrategy;

class RockPaperScissorsStrategyMapper {
  public static RockPaperScissors expectedHandFromStrategy(String code) {
    return switch (code) {
      case "A", "X" -> ROCK;
      case "B", "Y" -> PAPER;
      case "C", "Z" -> SCISSORS;
      default -> throw new InvalidInputException("code: " + code);
    };
  }

  public static GameResult expectedResultFromStrategy(String code) {
    return switch (code) {
      case "X" -> GameResult.LOSS;
      case "Y" -> GameResult.DRAW;
      case "Z" -> GameResult.WIN;
      default -> throw new InvalidInputException("code: " + code);
    };
  }

  public static RockPaperScissorsOwnHandStrategy fromString(String input) {
    String[] parts = splitInput(input);

    return new RockPaperScissorsOwnHandStrategy(RockPaperScissorsStrategyMapper.expectedHandFromStrategy(parts[0]),
                                                RockPaperScissorsStrategyMapper.expectedHandFromStrategy(parts[1]));
  }

  public static RockPaperScissorsExpectedResultStrategy expectedResultStrategyFromString(String input) {
    String[] parts = splitInput(input);

    return new RockPaperScissorsExpectedResultStrategy(RockPaperScissorsStrategyMapper.expectedHandFromStrategy(parts[0]),
                                                       RockPaperScissorsStrategyMapper.expectedResultFromStrategy(parts[1]));
  }

  private static String[] splitInput(String input) {
    String[] parts = input.trim().split(" ");

    if (parts.length != 2) {
      throw new InvalidInputException("input: " + input);
    }

    return parts;
  }
}
