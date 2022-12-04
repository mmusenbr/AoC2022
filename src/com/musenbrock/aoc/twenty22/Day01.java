package com.musenbrock.aoc.twenty22;

import com.musenbrock.aoc.twenty22.input.ElfCaloriesInputReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day01 {

  private final Map<Integer, List<Integer>> foodsPerElf;
  private final Map<Integer, Integer> caloriesPerElf;

  public Day01() throws IOException {
    foodsPerElf = ElfCaloriesInputReader.readElvesCalories();
    caloriesPerElf = foodsPerElf.entrySet()
                                .stream()
                                .collect(Collectors.toMap(Map.Entry::getKey,
                                                          entry -> entry.getValue().stream().mapToInt(i -> i).sum()));
  }

  public Map<Integer, Integer> getElvesCarrying() {
    return caloriesPerElf;
  }

  public int getElvesCarrying(int index) {
    return caloriesPerElf.getOrDefault(index, -1);
  }

  public int getElfMaxCarrying() {
    return caloriesPerElf.entrySet()
                         .stream()
                         .max(Comparator.comparingInt(Map.Entry::getValue))
                         .orElseGet(() -> Map.entry(-1, -1))
                         .getKey();
  }
}
