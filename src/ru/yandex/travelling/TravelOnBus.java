package ru.yandex.travelling;

import ru.yandex.travelling.types.Bus;

public class TravelOnBus implements Travelling<Bus> {

    @Override
    public Bus value() throws InterruptedException {
        final Bus bus = new Bus();
        bus.travel();
        return bus;
    }
}
