package dev.drf.my.zombie;

import dev.drf.my.zombie.atomic.ZombieAtomicInteger;

public interface ZombieLand {
    ZombieAtomicInteger newAtomicInteger(String name);

    ZombieAtomicInteger getAtomicInteger(String name);
}
