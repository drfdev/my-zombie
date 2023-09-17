package dev.drf.my.zombie.atomic.local;

import dev.drf.my.zombie.atomic.ZombieAtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public final class LocalZombieAtomicInteger implements ZombieAtomicInteger {
    private final AtomicInteger value;

    public LocalZombieAtomicInteger() {
        this.value = new AtomicInteger();
    }

    public LocalZombieAtomicInteger(int initialValue) {
        this.value = new AtomicInteger(initialValue);
    }

    @Override
    public int get() {
        return value.get();
    }

    @Override
    public void set(int newValue) {
        value.set(newValue);
    }

    @Override
    public int getAndSet(int newValue) {
        return value.getAndSet(newValue);
    }

    @Override
    public boolean compareAndSet(int expectedValue, int newValue) {
        return value.compareAndSet(expectedValue, newValue);
    }

    @Override
    public int getAndIncrement() {
        return value.getAndIncrement();
    }

    @Override
    public int incrementAndGet() {
        return value.incrementAndGet();
    }

    @Override
    public int getAndDecrement() {
        return value.getAndDecrement();
    }

    @Override
    public int decrementAndGet() {
        return value.decrementAndGet();
    }

    @Override
    public int getAndAdd(int delta) {
        return value.getAndAdd(delta);
    }

    @Override
    public int addAndGet(int delta) {
        return value.addAndGet(delta);
    }
}
