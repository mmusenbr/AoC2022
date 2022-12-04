package com.musenbrock.aoc.twenty22;

import com.musenbrock.aoc.twenty22.input.InputFiles;
import java.io.IOException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day02Test {
  @Test
  void scorePerGame() throws IOException {
    useExampleInput();

    Day02 day02 = new Day02();

    Assertions.assertEquals(8, day02.getScoreOfGame(0));
    Assertions.assertEquals(1, day02.getScoreOfGame(1));
    Assertions.assertEquals(6, day02.getScoreOfGame(2));
  }

  @Test
  void overallScore() throws IOException {
    useExampleInput();

    Day02 day02 = new Day02();

    Assertions.assertEquals(15, day02.getOverallScore());
  }

  @AfterEach
  void resetTestFilesUsage() {
    InputFiles.setUseExample(false);
  }

  void useExampleInput() {
    InputFiles.setUseExample(true);
  }
}
