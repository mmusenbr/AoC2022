package com.musenbrock.aoc.twenty22.input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ElfCaloriesInputReader {
  public static Map<Integer, List<Integer>> readElvesCalories() throws IOException {
    final AtomicInteger elf = new AtomicInteger(0);

    final Map<Integer, List<Integer>> elvesCalories = new HashMap<>();

    FileReader.readInputFile(InputFiles.DAY_01).forEach(line -> {
      if (line.isBlank()) {
        elf.incrementAndGet();
        elvesCalories.put(elf.get(), new ArrayList<>());
      } else {
        elvesCalories.computeIfAbsent(elf.get(), k -> new ArrayList<>()).add(Integer.valueOf(line));
      }
    });

    return elvesCalories;
  }
}
