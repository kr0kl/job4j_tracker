package ru.job4j.poly;

public interface Transport {
    void run();

    void passengers(int countPassengers);

    int refuel(int count);
}
