package com.musenbrock.aoc.twenty22.rockpaperscissors;

public class PointsCalculator {
  private ResultCalculator resultCalculator = new ResultCalculator();

  public int fromGame(RockPaperScissors opponent, RockPaperScissors own) {
    GameResult gameResult = resultCalculator.fromGame(opponent, own);

    int gamePoints = switch (gameResult) {
      case LOSS -> 0;
      case DRAW -> 3;
      case WIN -> 6;
    };

    int shapePoints = switch (own) {
      case ROCK -> 1;
      case PAPER -> 2;
      case SCISSORS -> 3;
    };

    return gamePoints + shapePoints;
  }
}
