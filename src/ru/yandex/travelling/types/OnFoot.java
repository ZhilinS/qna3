package ru.yandex.travelling.types;

public class OnFoot {

    public void travel() throws InterruptedException {
        System.out.println("Иду в путешествие пешком");
        Thread.sleep(5000);
    }

    public void say() {
        System.out.println("Наконец я закончил путшествие");
    }
}
