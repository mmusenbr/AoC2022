package com.musenbrock.aoc.twenty22.input;

import java.nio.file.Path;

public enum InputFiles {
  DAY_01("input_day01", "input_day01_example");

  public static Path FILE_PATH = Path.of("/home/michael/work/advent_of_code_2022/resources");

  private static boolean useExample = false;

  private String inputFileName;
  private String exampleInputFileName;


  InputFiles(String inputFileName, String exampleInputFileName) {
    this.inputFileName = inputFileName;
    this.exampleInputFileName = exampleInputFileName;
  }

  public String getInputFileName() {
    return (useExample) ? exampleInputFileName : inputFileName;
  }

  public static void setUseExample(boolean useExample) {
    InputFiles.useExample = useExample;
  }
}



