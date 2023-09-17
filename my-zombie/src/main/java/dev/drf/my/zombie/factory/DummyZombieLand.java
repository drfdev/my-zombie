package dev.drf.my.zombie.factory;

import dev.drf.my.zombie.ZombieLand;
import dev.drf.my.zombie.ZombieUnit;
import dev.drf.my.zombie.atomic.ZombieAtomicInteger;
import dev.drf.my.zombie.atomic.local.LocalZombieAtomicInteger;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DummyZombieLand implements ZombieLand {
    private final Map<UnitKey, ZombieUnit> localUnits;

    public DummyZombieLand() {
        this.localUnits = new ConcurrentHashMap<>();
    }

    @Override
    public ZombieAtomicInteger newAtomicInteger(String name) {
        var key = UnitKey.of(ZombieAtomicInteger.class, name);
        localUnits.remove(key);
        var atomic = new LocalZombieAtomicInteger();
        localUnits.put(key, atomic);
        return atomic;
    }

    @Override
    public ZombieAtomicInteger getAtomicInteger(String name) {
        var key = UnitKey.of(ZombieAtomicInteger.class, name);
        return (ZombieAtomicInteger) localUnits.get(key);
    }
}
