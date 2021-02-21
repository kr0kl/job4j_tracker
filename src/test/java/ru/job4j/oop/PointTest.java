package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void then3PointWhen() {
        Point first = new Point(1, 2, 3);
        Point second = new Point(4, 5, 6);
        double expect = first.distance3d(second);
        assertEquals(expect, 5.19, 0.01);
    }

}
