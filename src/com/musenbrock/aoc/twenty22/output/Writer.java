package com.musenbrock.aoc.twenty22.output;

import java.io.Closeable;
import java.io.IOException;

public interface Writer extends Closeable {
  Writer write(String content) throws IOException;
}
