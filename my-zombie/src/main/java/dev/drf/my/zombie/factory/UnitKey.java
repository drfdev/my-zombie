package dev.drf.my.zombie.factory;

import dev.drf.my.zombie.ZombieUnit;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

public final class UnitKey {
    private final Class<? extends ZombieUnit> clazz;
    private final String name;

    private UnitKey(Class<? extends ZombieUnit> clazz, String name) {
        this.clazz = clazz;
        this.name = name;
    }

    public static UnitKey of(Class<? extends ZombieUnit> clazz, String name) {
        requireNonNull(clazz);
        requireNonNull(name);
        return new UnitKey(clazz, name);
    }

    public Class<? extends ZombieUnit> getClazz() {
        return clazz;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnitKey unitKey = (UnitKey) o;
        return Objects.equals(clazz, unitKey.clazz)
                && Objects.equals(name, unitKey.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clazz, name);
    }

    @Override
    public String toString() {
        return "UnitKey{" +
                "clazz=" + clazz +
                ", name='" + name + '\'' +
                '}';
    }
}
