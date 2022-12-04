package com.musenbrock.aoc.twenty22.input;

import com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissorsExpectedResultStrategy;
import com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissorsOwnHandStrategy;
import java.io.IOException;
import java.util.List;

public class RockPaperScissorsStrategyInputReader {
  public List<RockPaperScissorsOwnHandStrategy> readRockPaperScissorsOwnHandStrategies() throws IOException {
    return FileReader.readInputFileSkipEmptyLines(InputFiles.DAY_02)
                     .map(RockPaperScissorsStrategyMapper::fromString)
                     .toList();
  }

  public List<RockPaperScissorsExpectedResultStrategy> readRockPaperScissorsExpectedResultStrategies() throws IOException {
    return FileReader.readInputFileSkipEmptyLines(InputFiles.DAY_02)
                     .map(RockPaperScissorsStrategyMapper::expectedResultStrategyFromString)
                     .toList();
  }
}