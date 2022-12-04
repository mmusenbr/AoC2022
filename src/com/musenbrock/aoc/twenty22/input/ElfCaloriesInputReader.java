package com.musenbrock.aoc.twenty22.input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ElfCaloriesInputReader {
  public static Map<Integer, List<Integer>> readElvesCalories() throws IOException {
    AtomicInteger elve = new AtomicInteger(0);

    final Map<Integer, List<Integer>> elfesCalories = new HashMap<>();

    FileReader.readInputFile(InputFiles.DAY_01).forEach(line -> {
      if (line.isBlank()) {
        elve.incrementAndGet();
        elfesCalories.put(elve.get(), new ArrayList<>());
      } else {
        elfesCalories.computeIfAbsent(elve.get(), k -> new ArrayList<>()).add(Integer.valueOf(line));
      }
    });

    return elfesCalories;
  }

  public static List<Integer> readElvesCalories(int elve) throws IOException {
    return readElvesCalories().getOrDefault(elve, new ArrayList<>());
  }
}
