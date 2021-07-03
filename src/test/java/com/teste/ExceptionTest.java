package com.teste;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTest {

    @Test
    public void empty() {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        assertThrows(
                IndexOutOfBoundsException.class,
                () -> new ArrayList<Object>().get(0),
                "Supposed to throw");
    }
}
