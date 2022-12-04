package com.musenbrock.aoc.twenty22.rockpaperscissors;

public class ResultCalculator {
  public GameResult fromGame(RockPaperScissors opponent, RockPaperScissors own) {
    int result = new RockPaperScissorsComparator().compare(own, opponent);
    if (result < 0) {
      return GameResult.LOSS;
    } else if (result == 0) {
      return GameResult.DRAW;
    } else {
      return GameResult.WIN;
    }
  }
}
