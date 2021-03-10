package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2, 3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax10To1Then10() {
        int result = Max.max(10, 1, 120, 5);
        assertThat(result, is(120));
    }

    @Test
    public void whenMax9To9Then9() {
        int result = Max.max(9, 9, 9, 9);
        assertThat(result, is(9));
    }
}