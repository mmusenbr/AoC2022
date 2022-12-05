package com.musenbrock.aoc.twenty22;

import com.musenbrock.aoc.twenty22.input.InputFiles;
import java.io.IOException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day02Test {
  @Test
  void scorePerGameViaOwnHandStrategy() throws IOException {
    useExampleInput();

    Day02 day02 = new Day02();

    Assertions.assertEquals(8, day02.getScoreOfGameViaOwnHandStrategy(0));
    Assertions.assertEquals(1, day02.getScoreOfGameViaOwnHandStrategy(1));
    Assertions.assertEquals(6, day02.getScoreOfGameViaOwnHandStrategy(2));
  }

  @Test
  void overallScoreViaOwnHandStrategy() throws IOException {
    useExampleInput();

    Day02 day02 = new Day02();

    Assertions.assertEquals(15, day02.getOverallScoreViaOwnHandStrategy());
  }

  @Test
  void scorePerGameViaExpectedResultStrategy() throws IOException {
    useExampleInput();

    Day02 day02 = new Day02();

    Assertions.assertEquals(4, day02.getScoreOfGameViaExpectedResultStrategy(0));
    Assertions.assertEquals(1, day02.getScoreOfGameViaExpectedResultStrategy(1));
    Assertions.assertEquals(7, day02.getScoreOfGameViaExpectedResultStrategy(2));
  }

  @Test
  void overallScoreViaExpectedResultStrategy() throws IOException {
    useExampleInput();

    Day02 day02 = new Day02();

    Assertions.assertEquals(12, day02.getOverallScoreViaExpectedResultStrategy());
  }

  @AfterEach
  void resetTestFilesUsage() {
    InputFiles.setUseExample(false);
  }

  void useExampleInput() {
    InputFiles.setUseExample(true);
  }
}
