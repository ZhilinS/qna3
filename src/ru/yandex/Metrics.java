package ru.yandex;

import ru.yandex.travelling.Travelling;

public class Metrics<T> {

    private final Travelling<T> travelling;

    public Metrics(final Travelling<T> travelling) {
        this.travelling = travelling;
    }

    public T time() throws InterruptedException {
        final long start = System.currentTimeMillis();
        final T type = travelling.value();
        final long end = System.currentTimeMillis();
        System.out.println("Путешествие заняло " + (end - start));
        return type;
    }
}
