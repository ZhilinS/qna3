package ru.yandex.travelling.types;

public class Bus implements Vehicle {

    @Override
    public void travel() throws InterruptedException {
        System.out.println("Начата поездка на автобусе");
        Thread.sleep(2000);
        System.out.println("Завершена поездка на автобусе");
    }

    @Override
    public void maintenance() {
        System.out.println("Подкачиваем шины");
    }
}
