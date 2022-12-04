package com.musenbrock.aoc.twenty22;

import com.musenbrock.aoc.twenty22.input.InputFiles;
import com.musenbrock.aoc.twenty22.output.StdoutWriter;
import com.musenbrock.aoc.twenty22.output.Writer;
import java.io.IOException;

public class AOC2022 {
  private Writer writer = new StdoutWriter();


  public static void main(String[] args) throws IOException {
    AOC2022 aoc2022 = new AOC2022();

    aoc2022.day01();
  }

  private void day01() throws IOException {
    Day01 day01 = new Day01();

    writeDayHeader(1);

    int elfIndexMaxCarrying = day01.getElfMaxCarrying();
    int calories = day01.getElvesCarrying(elfIndexMaxCarrying);

    writer.write("Elf " + (elfIndexMaxCarrying + 1) + " is carrying total " + calories + " calories.");
  }

  /**
   * Print a header for a day.
   *
   * @param day the day to print, 01.XX.XX is given via 1.
   */
  private void writeDayHeader(int day) throws IOException {
    writer.write("======= Day " + day + " ========");
  }

}
