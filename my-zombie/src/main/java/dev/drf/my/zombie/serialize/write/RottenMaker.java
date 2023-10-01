package dev.drf.my.zombie.serialize.write;

import dev.drf.my.zombie.serialize.Rotten;

public interface RottenMaker<T extends Rotten> {
    byte[] serialize(T value);
}
