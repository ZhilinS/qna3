package ru.yandex.travelling;

public interface Travelling<T> {

    T value() throws InterruptedException;

}
