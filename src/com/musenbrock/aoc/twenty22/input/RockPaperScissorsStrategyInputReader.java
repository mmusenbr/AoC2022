package com.musenbrock.aoc.twenty22.input;

import com.musenbrock.aoc.twenty22.rockpaperscissors.RockPaperScissorsStrategy;
import java.io.IOException;
import java.util.List;

public class RockPaperScissorsStrategyInputReader {
  public List<RockPaperScissorsStrategy> readRockPaperScissorsStrategies() throws IOException {
    return FileReader.readInputFileSkipEmptyLines(InputFiles.DAY_02)
                     .map(RockPaperScissorsStrategyMapper::fromString)
                     .toList();
  }
}