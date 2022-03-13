package ru.yandex.travelling.types;

public class Train implements Vehicle {

    @Override
    public void travel() throws InterruptedException {
        System.out.println("Начата поездка на поезде");
        Thread.sleep(1000);
        System.out.println("Завершена поездка на поезде");
    }

    @Override
    public void maintenance() {
        System.out.println("Проверяем проводку");
    }
}
