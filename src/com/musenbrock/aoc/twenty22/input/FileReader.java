package com.musenbrock.aoc.twenty22.input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FileReader {
  private static Path getFilePath(final String filepath) {
    return InputFiles.FILE_PATH.resolve(filepath);
  }

  public static Stream<String> readInputFile(final InputFiles input) throws IOException {
    final Path finalPath = getFilePath(input.getInputFileName());
    return Files.lines(finalPath);
  }

  public static Stream<String> readInputFileSkipEmptyLines(final InputFiles input) throws IOException {
    return readInputFile(input).filter(Objects::nonNull).filter(Predicate.not(String::isEmpty));
  }
}
