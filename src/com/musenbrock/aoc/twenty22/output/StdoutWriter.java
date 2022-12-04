package com.musenbrock.aoc.twenty22.output;

import java.io.IOException;

public class StdoutWriter implements Writer {
  @Override
  public Writer write(String content) throws IOException {
    System.out.println(content);
    return this;
  }

  @Override
  public void close() throws IOException {
  }
}
