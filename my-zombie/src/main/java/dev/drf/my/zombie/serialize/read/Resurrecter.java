package dev.drf.my.zombie.serialize.read;

import dev.drf.my.zombie.serialize.Rotten;

public interface Resurrecter<T extends Rotten> {
    T desearialize(byte[] bytes);
}
