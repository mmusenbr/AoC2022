package com.musenbrock.aoc.twenty22.rockpaperscissors;

import com.musenbrock.aoc.twenty22.input.InvalidInputException;
import java.util.Comparator;

public class RockPaperScissorsComparator implements Comparator<RockPaperScissors> {
  @Override
  public int compare(RockPaperScissors o1, RockPaperScissors o2) {
    if (o1 == o2) {
      return 0;
    } else if (o1 == null) {
      return -1;
    } else if (o2 == null) {
      return 1;
    }

    if (o1 == RockPaperScissors.SCISSORS) {
      return switch (o2) {
        case ROCK -> -1;
        case PAPER -> 1;
        case SCISSORS -> 0;
      };
    } else if (o1 == RockPaperScissors.ROCK) {
      return switch (o2) {
        case ROCK -> 0;
        case PAPER -> -1;
        case SCISSORS -> 1;
      };
    } else if (o1 == RockPaperScissors.PAPER) {
      return switch (o2) {
        case ROCK -> 1;
        case PAPER -> 0;
        case SCISSORS -> -1;
      };
    } else {
      throw new InvalidInputException("RPC: " + o2);
    }
  }
}
