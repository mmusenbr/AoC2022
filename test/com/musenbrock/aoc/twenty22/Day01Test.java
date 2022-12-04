package com.musenbrock.aoc.twenty22;

import com.musenbrock.aoc.twenty22.input.InputFiles;
import java.io.IOException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day01Test {
  @Test
  void caloriesPerElf() throws IOException {
    useExampleInput();

    Day01 day01 = new Day01();

    Assertions.assertEquals(6000, day01.getElvesCarrying(0));
    Assertions.assertEquals(4000, day01.getElvesCarrying(1));
    Assertions.assertEquals(11000, day01.getElvesCarrying(2));
    Assertions.assertEquals(24000, day01.getElvesCarrying(3));
    Assertions.assertEquals(10000, day01.getElvesCarrying(4));
  }

  @Test
  void elfMaxCalories() throws IOException {
    useExampleInput();

    Day01 day01 = new Day01();

    Assertions.assertEquals(3, day01.getElfMaxCarrying());
  }

  @AfterEach
  void resetTestFilesUsage() {
    InputFiles.setUseExample(false);
  }

  void useExampleInput() {
    InputFiles.setUseExample(true);
  }
}
