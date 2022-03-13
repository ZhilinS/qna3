package ru.yandex;

import ru.yandex.travelling.TravelOnBus;
import ru.yandex.travelling.TravelOnFoot;
import ru.yandex.travelling.TravelOnTrain;
import ru.yandex.travelling.types.OnFoot;
import ru.yandex.travelling.types.Vehicle;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Vehicle bus = new Metrics<>(
            new TravelOnBus()
        ).time();
        Vehicle train = new Metrics<>(
            new TravelOnTrain()
        ).time();
        final OnFoot foot = new Metrics<>(
            new TravelOnFoot()
        ).time();
        bus.maintenance();
        train.maintenance();
        foot.say();
    }
}
