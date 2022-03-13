package ru.yandex.travelling;

import ru.yandex.travelling.types.OnFoot;

public class TravelOnFoot implements Travelling<OnFoot> {

    @Override
    public OnFoot value() throws InterruptedException {
        final OnFoot foot = new OnFoot();
        foot.travel();
        return foot;
    }
}
