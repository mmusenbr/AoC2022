package com.musenbrock.aoc.twenty22;

import com.musenbrock.aoc.twenty22.input.RockPaperScissorsStrategyInputReader;
import com.musenbrock.aoc.twenty22.rockpaperscissors.Game;
import com.musenbrock.aoc.twenty22.rockpaperscissors.GameCalculator;
import com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissorsExpectedResultStrategy;
import com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissorsOwnHandStrategy;
import java.io.IOException;
import java.util.List;

public class Day02 {
  final RockPaperScissorsStrategyInputReader inputReader = new RockPaperScissorsStrategyInputReader();
  final GameCalculator gameCalculator = GameCalculator.getGameCalculator();

  final List<RockPaperScissorsOwnHandStrategy> ownHandStrategies;
  final List<Game> ownHandStrategyResults;
  final List<Game> expectedResultsStrategyResults;
  final List<RockPaperScissorsExpectedResultStrategy> expectedResultStrategies;

  public Day02() throws IOException {
    ownHandStrategies = inputReader.readRockPaperScissorsOwnHandStrategies();
    expectedResultStrategies = inputReader.readRockPaperScissorsExpectedResultStrategies();

    ownHandStrategyResults = ownHandStrategies.stream().map(gameCalculator::fromStrategy).toList();
    expectedResultsStrategyResults = expectedResultStrategies.stream().map(gameCalculator::fromStrategy).toList();
  }

  public int getScoreOfGameViaOwnHandStrategy(int gameIndex) {
    return ownHandStrategyResults.get(gameIndex).points();
  }

  public int getOverallScoreViaOwnHandStrategy() {
    return ownHandStrategyResults.stream().mapToInt(Game::points).sum();
  }

  public int getScoreOfGameViaExpectedResultStrategy(int gameIndex) {
    return expectedResultsStrategyResults.get(gameIndex).points();
  }

  public int getOverallScoreViaExpectedResultStrategy() {
    return expectedResultsStrategyResults.stream().mapToInt(Game::points).sum();
  }
}
