package com.musenbrock.aoc.twenty22;

import com.musenbrock.aoc.twenty22.input.RockPaperScissorsStrategyInputReader;
import com.musenbrock.aoc.twenty22.rockpaperscissors.PointsCalculator;
import com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissorsOwnHandStrategy;
import java.io.IOException;
import java.util.List;

public class Day02 {
  final RockPaperScissorsStrategyInputReader inputReader = new RockPaperScissorsStrategyInputReader();
  final PointsCalculator pointsCalculator = new PointsCalculator();
  final List<RockPaperScissorsOwnHandStrategy> gameAndStrategies;
  final List<Integer> gameScore;

  public Day02() throws IOException {
    gameAndStrategies = inputReader.readRockPaperScissorsOwnHandStrategies();
    gameScore = gameAndStrategies.stream()
                                 .map(strategy -> pointsCalculator.fromGame(strategy.opponent(), strategy.own()))
                                 .toList();
  }

  public int getScoreOfGame(int gameIndex) {
    return gameScore.get(gameIndex);
  }

  public int getOverallScore() {
    return gameScore.stream().mapToInt(i -> i).sum();
  }
}
