package com.teste;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class RuleTest {
    @Test
    public void shouldCreateNewFileInTempFolder(@TempDir Path tempDir) throws IOException {
        Path numbers = tempDir.resolve("numbers.txt");

        List<String> lines = Arrays.asList("1", "2", "3");
        Files.write(numbers, lines);

        assertAll(
                () -> assertTrue(Files.exists(numbers)),
                () -> assertLinesMatch(lines, Files.readAllLines(numbers)));
    }
}
