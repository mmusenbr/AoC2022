package com.musenbrock.aoc.twenty22.rockpaperscissors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameCalculator {
  private static GameCalculator calculator = null;
  private PointsCalculator pointsCalculator = new PointsCalculator();
  private List<Game> allPossibleGames;

  public static synchronized GameCalculator getGameCalculator() {
    if (calculator == null) {
      calculator = new GameCalculator();
    }

    return calculator;
  }

  private GameCalculator() {
    allPossibleGames = calculateAllPossibleGames();
  }

  private List<Game> calculateAllPossibleGames() {
    final List<Game> games = new ArrayList<>();
    Arrays.stream(RockPaperScissors.values()).forEach(opponentsHand -> {
      Arrays.stream(RockPaperScissors.values()).forEach(ownHand -> {
        games.add(fromGame(opponentsHand, ownHand));
      });
    });
    return games;
  }

  public Game fromStrategy(RockPaperScissorsOwnHandStrategy strategy) {
    return allPossibleGames.stream()
                           .filter(game -> game.opponentsHand() == strategy.opponent()
                                           && game.ownHand() == strategy.own())
                           .findFirst()
                           .orElseThrow();
  }

  public Game fromStrategy(RockPaperScissorsExpectedResultStrategy strategy) {
    return allPossibleGames.stream()
                           .filter(game -> game.opponentsHand() == strategy.opponent()
                                           && game.gameResult() == strategy.expectedResult())
                           .findFirst()
                           .orElseThrow();
  }

  private Game fromGame(RockPaperScissors opponent, RockPaperScissors own) {
    final GameResult gameResult;

    int result = new RockPaperScissorsComparator().compare(own, opponent);
    if (result < 0) {
      gameResult = GameResult.LOSS;
    } else if (result == 0) {
      gameResult = GameResult.DRAW;
    } else {
      gameResult = GameResult.WIN;
    }

    return fromGame(opponent, own, gameResult);
  }

  private Game fromGame(RockPaperScissors opponent, RockPaperScissors own, GameResult result) {
    int points = pointsCalculator.fromGame(own, result);
    return new Game(opponent, own, result, points);
  }
}
