package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void passengers(int countPassengers) {
        System.out.println(countPassengers);
    }

    @Override
    public int refuel(int count) {
        int price = 50;
        return price * count;
    }
}
