package com.musenbrock.aoc.twenty22.rockpaperscissors;

class PointsCalculator {
  int fromGame(RockPaperScissors ownHand, GameResult gameResult) {
    int gamePoints = switch (gameResult) {
      case LOSS -> 0;
      case DRAW -> 3;
      case WIN -> 6;
    };

    int shapePoints = switch (ownHand) {
      case ROCK -> 1;
      case PAPER -> 2;
      case SCISSORS -> 3;
    };

    return gamePoints + shapePoints;
  }
}
