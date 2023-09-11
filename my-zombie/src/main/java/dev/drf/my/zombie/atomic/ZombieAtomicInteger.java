package dev.drf.my.zombie.atomic;

import dev.drf.my.zombie.ZombieUnit;

public interface ZombieAtomicInteger extends ZombieUnit {
    int get();

    void set(int newValue);

    int getAndSet(int newValue);

    boolean compareAndSet(int expectedValue, int newValue);

    int getAndIncrement();

    int incrementAndGet();

    int getAndDecrement();

    int decrementAndGet();

    int getAndAdd(int delta);

    int addAndGet(int delta);
}
