package dev.drf.my.zombie;

import dev.drf.my.zombie.factory.DummyZombieLand;

public final class ZombieLandBuilder {
    private ZombieLandBuilder() {
    }

    public static ZombieLandBuilder builder() {
        return new ZombieLandBuilder();
    }

    public ZombieLand build() {
        return new DummyZombieLand();
    }
}
