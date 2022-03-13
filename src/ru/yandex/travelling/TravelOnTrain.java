package ru.yandex.travelling;

import ru.yandex.travelling.types.Train;

public class TravelOnTrain implements Travelling<Train> {

    @Override
    public Train value() throws InterruptedException {
        final Train train = new Train();
        train.travel();
        return train;
    }
}
