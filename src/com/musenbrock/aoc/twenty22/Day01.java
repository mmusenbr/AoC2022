package com.musenbrock.aoc.twenty22;

import com.musenbrock.aoc.twenty22.input.ElfCaloriesInputReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Day01 {

  private Day01() {
  }

  public static Map<Integer, Integer> getElvesCarrying() throws IOException {
    return ElfCaloriesInputReader.readElvesCalories()
                                 .entrySet()
                                 .stream()
                                 .collect(Collectors.toMap(Map.Entry::getKey,
                                                           entry -> entry.getValue().stream().mapToInt(i -> i).sum()));
  }

  public static int getElvesCarrying(int index) throws IOException {
    return ElfCaloriesInputReader.readElvesCalories(index).stream().mapToInt(i -> i).sum();
  }

  public static int getElfMaxCarrying() throws IOException {
    return getElvesCarrying().entrySet()
                             .stream()
                             .max(Comparator.comparingInt(Map.Entry::getValue))
                             .orElseGet(() -> Map.entry(-1, -1))
                             .getKey();
  }
}
