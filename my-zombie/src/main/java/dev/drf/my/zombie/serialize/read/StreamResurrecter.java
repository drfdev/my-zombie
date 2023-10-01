package dev.drf.my.zombie.serialize.read;

import dev.drf.my.zombie.serialize.Rotten;

import java.io.InputStream;

public interface StreamResurrecter<T extends Rotten> {
    T readFromStream(InputStream stream);
}
